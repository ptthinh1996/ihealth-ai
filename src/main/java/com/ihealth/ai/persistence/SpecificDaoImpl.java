package com.ihealth.ai.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpecificDaoImpl implements SpecificDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Boolean healthCheck() {
        String sql = "Select version()";
        String result = jdbcTemplate.queryForObject(sql, String.class);
        return result != null;
    }

}
