package com.jdi;

public interface LongValue extends PrimitiveValue, Comparable<LongValue> 
{ 
    
    long value(); 
 
    public boolean equals(Object obj); 
 
    int hashCode(); 
}
