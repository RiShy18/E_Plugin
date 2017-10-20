package com.jdi;


public interface Field extends TypeComponent, Comparable<Field> { 
 
   
    String typeName(); 
 
    Type type() throws ClassNotLoadedException; 
 

    public boolean isTransient(); 

    public boolean isVolatile(); 
 

    public boolean isEnumConstant(); 
  
    public boolean equals(Object obj); 
 

    int hashCode(); 
}