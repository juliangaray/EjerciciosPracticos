package com.sophossolutions.exceptions;

public class GeneralException extends AssertionError{

    public GeneralException(String message, Throwable cause){
        super(message, cause);
    }    
}
