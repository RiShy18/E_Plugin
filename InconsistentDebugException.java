package com.jdi;


public class InconsistentDebugException extends RuntimeException { 
    public InconsistentDebugException() { 
        super(); 
    } 
 
    public InconsistentDebugException(String s) { 
        super(s); 
    } 
}
