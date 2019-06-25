package com.ihealth.ai.controller.v1;

import com.ihealth.ai.common.dto.ResponseDto;
import com.ihealth.ai.common.view_model.RelatedCalculateModel;
import com.ihealth.ai.common.view_model.ScoreCalculateModel;
import com.ihealth.ai.controller.GeneralController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "")
public class GeneralControllerV1 extends GeneralController {

    @GetMapping(value = "/health")
    public ResponseDto healthCheck() {
        return super.healthCheck();
    }
    
    @Override
    @PostMapping(value = "/calculate_product_scores", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDto calculateScore(@RequestBody ScoreCalculateModel scoreCalculateModel) {
        return super.calculateScore(scoreCalculateModel);
    }
    
    @Override
    @PostMapping(value = "/calculate_related", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseDto calculateRelated(@RequestBody RelatedCalculateModel relatedCalculateModel) {
        return super.calculateRelated(relatedCalculateModel);
    }
}
