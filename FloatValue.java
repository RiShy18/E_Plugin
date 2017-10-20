package com.jdi;


public interface FloatValue extends PrimitiveValue, Comparable<FloatValue> 
{ 

    float value(); 
 
    public boolean equals(Object obj); 

    int hashCode(); 
}
