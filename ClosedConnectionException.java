package com.jdi.connect.spi;

public class ClosedConnectionException extends java.io.IOException { 

    public ClosedConnectionException() { 
    } 
    public ClosedConnectionException(String message) { 
        super(message); 
    } 
 
}