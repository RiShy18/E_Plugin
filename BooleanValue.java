package com.jdi;

public interface BooleanValue extends PrimitiveValue 
{ 
    
    boolean value(); 
 
   
    boolean equals(Object obj); 
 
    int hashCode(); 
}