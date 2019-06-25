package com.ihealth.ai.service;


import com.ihealth.ai.common.dto.ProductDto;
import com.ihealth.ai.common.dto.RelatedDto;
import com.ihealth.ai.common.dto.RelatedProductDto;
import com.ihealth.ai.common.util.MyNumberUtil;
import com.ihealth.ai.common.view_model.RelatedCalculateModel;
import com.ihealth.ai.common.view_model.RelatedProduct;
import com.ihealth.ai.common.view_model.ScoreCalculateModel;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(value = "transactionManager", propagation = Propagation.SUPPORTS)
public class AIServiceImpl implements AIService {

    private Logger logger = Logger.getLogger(AIServiceImpl.class);
    
    @Override
    public List<ProductDto> calculateScore(ScoreCalculateModel scoreCalculateModel) {
        List<ProductDto> productDtos = new ArrayList<>();
        
        Double maxProductPoint = 0.0;
        for (ScoreCalculateModel.Product product : scoreCalculateModel.getProducts()) {
            
            Double productPoint = (product.getOrderCount() * 20) + (product.getTrackCount() * 1);
            
            if (productPoint > maxProductPoint) {
                maxProductPoint = productPoint;
            }
        }
        
        Double scorePerPoint = 0.8 / maxProductPoint;
        
        for (ScoreCalculateModel.Product product : scoreCalculateModel.getProducts()) {
            ProductDto productDto = new ProductDto();
            Double productPoint = (product.getOrderCount() * 20) + (product.getTrackCount() * 1);
            Double score = scorePerPoint * productPoint;
            if (product.getHighlight() != null && product.getHighlight()) {
                score += 0.2;
            }
            productDto.setId(product.getId());
            productDto.setScore(MyNumberUtil.roundUpDouble(score,2));
            productDtos.add(productDto);
        }
        
        return productDtos;
    }
    
    @Override
    public RelatedProductDto calculateRelated(RelatedCalculateModel relatedCalculateModel) {
        RelatedProductDto relatedProductDto = new RelatedProductDto();
        
        List<RelatedProduct> relatedProducts = relatedCalculateModel.getRelatedProducts();
        
        Double maxOrderCount = 0.0;
        
        for (RelatedProduct relatedProduct : relatedProducts) {
            if (relatedProduct.getRelatedOrderCount() > maxOrderCount) {
                maxOrderCount = relatedProduct.getRelatedOrderCount();
            }
        }
    
        Double scorePerPoint = 0.0;
        if ( maxOrderCount > 0) {
            scorePerPoint = 0.4 / maxOrderCount;
        }
        
        List<RelatedDto> relatedDtos = new ArrayList<>();
        for (RelatedProduct relatedProduct : relatedProducts) {
            
            RelatedDto relatedDto = new RelatedDto();
            
            Double relatedScore = 0.0;
            if (relatedProduct.getIsSameCategory()) {
                relatedScore += 0.4;
            }
            relatedScore += (scorePerPoint * relatedProduct.getRelatedOrderCount()) + 0.2 * relatedProduct.getScore();
    
            relatedDto.setId(relatedProduct.getId());
            relatedDto.setRelatedScore(MyNumberUtil.roundUpDouble(relatedScore, 2));
            relatedDtos.add(relatedDto);
        }
        relatedProductDto.setId(relatedCalculateModel.getId());
        relatedProductDto.setRelatedDtos(relatedDtos);
        return relatedProductDto;
    }
}
