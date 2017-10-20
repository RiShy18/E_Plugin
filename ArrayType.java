package com.jdi;

import java.util.List; 

public interface ArrayType extends ReferenceType { 

    ArrayReference newInstance(int length); 

    String componentSignature(); 
 
    String componentTypeName(); 
 
    Type componentType() throws ClassNotLoadedException; 
}

