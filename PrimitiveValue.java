package com.jdi;

public interface PrimitiveValue extends Value { 

    public boolean booleanValue(); 

    byte byteValue(); 
 
    char charValue(); 

    short shortValue(); 
 
    int intValue(); 
 
    long longValue(); 
 
    float floatValue(); 

    double doubleValue(); 
}