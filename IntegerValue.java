package com.jdi;


public interface IntegerValue extends PrimitiveValue, Comparable<IntegerValue> 
{ 
    int value(); 
 

    public boolean equals(Object obj); 
 
    /**
     * Returns the hash code value for this IntegerValue.
     * @return the integer hash code 
     */ 
    int hashCode(); 
}
