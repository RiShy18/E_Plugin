package com.jdi;

public class VMOutofMemoryException extends RuntimeException { 
    public VMOutofMemoryException() { 
        super(); 
    } 
 
    public VMOutofMemoryException(String s) { 
        super(s); 
    } 
}

