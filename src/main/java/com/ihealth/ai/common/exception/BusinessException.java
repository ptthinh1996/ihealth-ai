package com.ihealth.ai.common.exception;

public class BusinessException extends Exception {

    private static final long serialVersionUID = 63230199878230047L;
    private final Integer code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
        this.code = null;
    }

    public BusinessException(String message) {
        super(message);
        this.code = null;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCode() {
        return code;
    }

}
