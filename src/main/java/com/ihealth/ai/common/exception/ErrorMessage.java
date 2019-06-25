package com.ihealth.ai.common.exception;

public class ErrorMessage {

    public static final String APP_ERROR_MESSAGE = "Application error, please contact Administrator for support!";

    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage () {
        return message;
    }

    public void setMessage (String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals (Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        ErrorMessage that = (ErrorMessage) o;

        if ( code != that.code ) {
            return false;
        }
        return message != null ? message.equals(that.message) : that.message == null;

    }

    @Override
    public String toString () {
        return "ErrorMessage{" +
               "code=" + code +
               ", message='" + message + '\'' +
               '}';
    }
}
