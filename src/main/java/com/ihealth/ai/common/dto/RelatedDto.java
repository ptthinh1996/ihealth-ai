package com.ihealth.ai.common.dto;

import java.io.Serializable;
import java.util.List;

public class RelatedDto implements Serializable {
    
    private static final long serialVersionUID = -1381897574619436107L;
    
    private String id;
    private Double relatedScore;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public Double getRelatedScore() {
        return relatedScore;
    }
    
    public void setRelatedScore(Double relatedScore) {
        this.relatedScore = relatedScore;
    }
}