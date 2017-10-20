package com.jdi;


public interface TypeComponent extends Mirror, Accesible { 

    String name(); 

    String signature(); 

    String genericSignature(); 
 
    ReferenceType declaringType(); 
    public boolean isStatic(); 
    public boolean isFinal(); 
    public boolean isSynthetic(); 
}