package com.jdi;

import java.util.List; 


public interface Location extends Mirror, Comparable<Location> { 
 
    ReferenceType declaringType(); 
 
  
    Method method(); 
 
    long codeIndex(); 
 
    String sourceName() throws AbsentInformationException; 
 
 
    String sourcePath() throws AbsentInformationException; 
 

    String sourcePath(String stratum)throws AbsentInformationException; 

    int lineNumber(); 
 
  
    int lineNumber(String stratum); 
 
    boolean equals(Object obj); 
 

    int hashCode(); 
}

