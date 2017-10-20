package com.jdi;

import java.util.List; 


public interface ClassLoaderReference extends ObjectReference { 
 
    List<ReferenceType> definedClasses(); 
 
    List<ReferenceType> visibleClasses(); 
}

