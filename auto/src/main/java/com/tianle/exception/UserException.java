package com.tianle.exception;

/**
 * Created by win7 on 2017/6/21.
 */
public class UserException extends RuntimeException {

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private Integer code;

    public UserException(Integer code, String message)
    {
        super(message);
        this.code = code;
    }
}
