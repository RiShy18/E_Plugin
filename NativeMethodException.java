package com.jdi;



public class NativeMethodException extends RuntimeException { 
 
    public NativeMethodException() { 
        super(); 
    } 
 
    public NativeMethodException(String message) { 
        super(message); 
    } 
}