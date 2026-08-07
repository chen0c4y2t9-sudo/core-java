package com.itszb.demo1;

/**
 * 自定义异常
 */
public class RegisterException extends Exception{

    public RegisterException(){}

    public RegisterException(String message) {
        super(message);
    }
}
