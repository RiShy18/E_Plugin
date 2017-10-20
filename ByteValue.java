package com.jdi;


public interface ByteValue extends PrimitiveValue, Comparable<ByteValue> 
{ 
    
    byte value(); 
    public boolean equals(Object obj); 
    int hashCode(); 
}
