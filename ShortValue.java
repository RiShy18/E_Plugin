package com.jdi;


public interface ShortValue extends PrimitiveValue, Comparable<ShortValue> 
{ 
    
    short value(); 
    public boolean equals(Object obj); 
    int hashCode(); 
}
