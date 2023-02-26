package com.suntec.retail.commonException;

public class RuleInterruptException extends RuntimeException{

    private String message;

    public RuleInterruptException() {}

    public RuleInterruptException(String msg)
    {
        super(msg);
        this.message = msg;
    }
}