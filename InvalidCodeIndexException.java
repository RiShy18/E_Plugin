package com.jdi;


@SuppressWarnings("serial")
@Deprecated 
public class InvalidCodeIndexException extends RuntimeException { 
    public InvalidCodeIndexException() { 
        super(); 
    } 
 
    public InvalidCodeIndexException(String s) { 
        super(s); 
    } 
}