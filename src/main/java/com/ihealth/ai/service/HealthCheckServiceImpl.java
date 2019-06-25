package com.ihealth.ai.service;

import com.ihealth.ai.common.dto.HealthCheckDto;
import com.ihealth.ai.persistence.SpecificDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(value = "transactionManager", propagation = Propagation.SUPPORTS)
public class HealthCheckServiceImpl implements HealthCheckService {

    private Logger logger = Logger.getLogger(HealthCheckServiceImpl.class);

    @Autowired
    private SpecificDao specificDao;

    @Override
    public HealthCheckDto check() {
        logger.info("healthCheck");

        HealthCheckDto dto = new HealthCheckDto();
        StringBuilder message = new StringBuilder();

        // Check MySql
        if (specificDao.healthCheck()) {
            message.append("SQL checked!");
        }

        // Check Cache Server


        dto.setMessage(message.toString());
        return dto;
    }
}
