package com.jdi;



public interface CharValue extends PrimitiveValue, Comparable<CharValue> 
{ 

   char value(); 


   boolean equals(Object obj); 


   int hashCode(); 
}