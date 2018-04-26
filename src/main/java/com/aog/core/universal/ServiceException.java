package com.aog.core.universal;

import java.io.Serializable;
/**
 * Created by mingle on 2018/4/26.
 */
public class ServiceException extends RuntimeException implements Serializable{

    private static final long serialVersionUID = 1213855733833039552L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}