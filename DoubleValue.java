package com.jdi;


public interface DoubleValue extends PrimitiveValue, Comparable<DoubleValue> 
{  
    double value(); 
 
    boolean equals(Object obj); 
 
    int hashCode(); 
}