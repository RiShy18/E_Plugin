package com.jdi;

import java.util.List; 


public interface Method extends TypeComponent, Locatable, Comparable<Method> { 
 
    String returnTypeName(); 
 
    Type returnType() throws ClassNotLoadedException; 
 
    List<String> argumentTypeNames(); 
 
    List<Type> argumentTypes() throws ClassNotLoadedException; 
 
    public boolean isAbstract(); 
 
    public boolean isSynchronized(); 
 
    public boolean isNative(); 
 
    public boolean isVarArgs(); 
 
    public boolean isBridge(); 
 
    public  boolean isConstructor(); 
 
    public  boolean isStaticInitializer(); 
 
    public boolean isObsolete(); 
 
    List<Location> allLineLocations() throws AbsentInformationException; 
 
    List<Location> allLineLocations(String stratum, String sourceName)throws AbsentInformationException; 
 
    List<Location> locationsOfLine(int lineNumber) throws AbsentInformationException; 
 
    
    List<Location> locationsOfLine(String stratum, String sourceName, int lineNumber)throws AbsentInformationException; 
 

    Location locationOfCodeIndex(long codeIndex); 
 
    List<LocalVariable> variables() throws AbsentInformationException; 

    List<LocalVariable> variablesByName(String name)   throws AbsentInformationException; 
 
    List<LocalVariable> arguments() throws AbsentInformationException; 

    byte[] bytecodes(); 
 
   
    Location location(); 
 
    public boolean equals(Object obj); 
 
    int hashCode(); 
}
