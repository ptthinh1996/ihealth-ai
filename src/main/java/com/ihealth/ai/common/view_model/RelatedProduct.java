package com.ihealth.ai.common.view_model;

import java.util.List;

public class RelatedProduct {
    
    String id;
    Double relatedOrderCount;
    Boolean isSameCategory;
    Double score;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public Double getRelatedOrderCount() {
        return relatedOrderCount;
    }
    
    public void setRelatedOrderCount(Double relatedOrderCount) {
        this.relatedOrderCount = relatedOrderCount;
    }
    
    public Boolean getIsSameCategory() {
        return isSameCategory;
    }
    
    public void setIsSameCategory(Boolean isSameCategory) {
        this.isSameCategory = isSameCategory;
    }
    
    public Double getScore() {
        return score;
    }
    
    public void setScore(Double score) {
        this.score = score;
    }
}
