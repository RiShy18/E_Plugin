package com.jdi;

import java.util.List; 


public interface ClassType extends ReferenceType { 
  
    ClassType superclass(); 
 
    List<InterfaceType> interfaces(); 
 
    List<InterfaceType> allInterfaces(); 
 
    List<ClassType> subclasses(); 
 
    public boolean isEnum(); 
 
    public void setValue(Field field, Value value) throws InvalidTypeException, ClassNotLoadedException;
    /** Perform method invocation with only the invoking thread resumed */ 
    static final int INVOKE_SINGLE_THREADED = 0x1; 
  
    Value invokeMethod(ThreadReference thread, Method method,List<? extends Value> arguments, int options) throws InvalidTypeException,ClassNotLoadedException, IncompatibleThreadStateException,InvocationException; 
 
    ObjectReference newInstance(ThreadReference thread, Method method, List<? extends Value> arguments, int options) throws InvalidTypeException,ClassNotLoadedException,IncompatibleThreadStateException,InvocationException;
    
    Method concreteMethodByName(String name, String signature); 
}