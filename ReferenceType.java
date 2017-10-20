package com.jdi;

import java.util.List; 
import java.util.Map; 
 public interface ReferenceType extends Type, Comparable<ReferenceType>, Accesible { 

    String name(); 
 
    String genericSignature(); 
 
    ClassLoaderReference classLoader(); 
 
   
    String sourceName() throws AbsentInformationException; 
 
    List<String> sourceNames(String stratum) throws AbsentInformationException; 
 
   
    List<String> sourcePaths(String stratum) throws AbsentInformationException; 
 
    String sourceDebugExtension() throws AbsentInformationException; 
    public boolean isStatic(); 
    public boolean isAbstract(); 
    public boolean isFinal(); 
    public boolean isPrepared(); 
    public boolean isVerified(); 
    public boolean isInitialized(); 
    public boolean failedToInitialize(); 
 
 
    List<Field> fields(); 

    List<Field> visibleFields(); 

    List<Field> allFields(); 
 
    Field fieldByName(String fieldName); 

    List<Method> methods(); 
 
    List<Method> visibleMethods(); 
 
    List<Method> allMethods(); 
 
    List<Method> methodsByName(String name); 
 
    List<Method> methodsByName(String name, String signature); 

    List<ReferenceType> nestedTypes(); 
 
    public Value getValue(Field field); 
 
    Map<Field,Value> getValues(List<? extends Field> fields); 

    ClassObjectReference classObject(); 
 

    List<Location> allLineLocations() throws AbsentInformationException; 
 
    List<Location> allLineLocations(String stratum, String sourceName)throws AbsentInformationException; 
 

    List<Location> locationsOfLine(int lineNumber)throws AbsentInformationException; 
 
    
    List<Location> locationsOfLine(String stratum, String sourceName, int lineNumber)throws AbsentInformationException; 
 
    List<String> availableStrata(); 
 
   
    String defaultStratum(); 
 
    List<ObjectReference> instances(long maxInstances); 
 
    public boolean equals(Object obj); 
    
    int hashCode(); 
    int majorVersion(); 
    int minorVersion(); 
    int constantPoolCount();
    byte[] constantPool(); 
 
}