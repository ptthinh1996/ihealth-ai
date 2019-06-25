package com.ihealth.ai.common.view_model;

import java.util.List;

public class RelatedCalculateModel {
    
    String id;
    List<RelatedProduct> relatedProducts;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public List<RelatedProduct> getRelatedProducts() {
        return relatedProducts;
    }
    
    public void setRelatedProducts(List<RelatedProduct> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }
}
