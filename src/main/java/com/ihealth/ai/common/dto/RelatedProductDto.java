package com.ihealth.ai.common.dto;

import java.io.Serializable;
import java.util.List;

public class RelatedProductDto implements Serializable {
    
    private static final long serialVersionUID = -1381897574619436107L;
    
    private String           id;
    private List<RelatedDto> relatedDtos;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public List<RelatedDto> getRelatedDtos() {
        return relatedDtos;
    }
    
    public void setRelatedDtos(List<RelatedDto> relatedDtos) {
        this.relatedDtos = relatedDtos;
    }
}