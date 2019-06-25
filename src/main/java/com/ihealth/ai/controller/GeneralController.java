package com.ihealth.ai.controller;


import com.ihealth.ai.common.dto.ResponseDto;
import com.ihealth.ai.common.view_model.RelatedCalculateModel;
import com.ihealth.ai.common.view_model.ScoreCalculateModel;
import com.ihealth.ai.service.AIService;
import com.ihealth.ai.service.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;

public class GeneralController {
    
    @Autowired
    AIService aiService;

    @Autowired
    private HealthCheckService healthCheckService;

    public ResponseDto healthCheck () {
        return new ResponseDto(healthCheckService.check());
    }
    
    public ResponseDto calculateScore(ScoreCalculateModel scoreCalculateModel) {
        return new ResponseDto(aiService.calculateScore(scoreCalculateModel));
    }
    
    public ResponseDto calculateRelated(RelatedCalculateModel relatedCalculateModel) {
        return new ResponseDto(aiService.calculateRelated(relatedCalculateModel));
    }
}
