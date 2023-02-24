package com.suntec.retail.commonException;

public class RuleBreakException extends RuntimeException{

    private String message;

    public RuleBreakException() {}

    public RuleBreakException(String msg)
    {
        super(msg);
        this.message = msg;
    }
}