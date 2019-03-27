package com.buyi.common.exception;

public class GlobalException extends RuntimeException {

    private int code;

    public int getCode() {
        return code;
    }

    public GlobalException(String message, int code) {
        super(message);
        this.code = code;
    }

    public GlobalException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }
}
