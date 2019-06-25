package com.ihealth.ai.service;

import com.ihealth.ai.common.dto.ProductDto;
import com.ihealth.ai.common.dto.RelatedProductDto;
import com.ihealth.ai.common.view_model.RelatedCalculateModel;
import com.ihealth.ai.common.view_model.ScoreCalculateModel;

import java.util.List;

public interface AIService {

    List<ProductDto> calculateScore(ScoreCalculateModel scoreCalculateModel);
    
    RelatedProductDto calculateRelated(RelatedCalculateModel relatedCalculateModel);
}