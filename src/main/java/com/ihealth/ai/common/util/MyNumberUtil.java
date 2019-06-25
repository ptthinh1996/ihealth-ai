package com.ihealth.ai.common.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyNumberUtil {

    /**
     * round doubles to n decimal places
     *
     * @param value
     * @param places
     * @return
     */
    public static Double roundUpDouble(Double value, Integer places) {
        if (value == null || places == null) {
            return null;
        }
    
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.UP);
        return bd.doubleValue();
    }
}