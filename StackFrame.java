package com.jdi;

import java.util.List; 
import java.util.Map; 
 
public interface StackFrame extends Mirror, Locatable 
{ 
  
    Location location(); 
 
    ThreadReference thread(); 
 
  
    ObjectReference thisObject(); 
 
    List<LocalVariable> visibleVariables() throws AbsentInformationException; 
 

    LocalVariable visibleVariableByName(String name) throws AbsentInformationException; 
 
    Value getValue(LocalVariable variable); 
 
    Map<LocalVariable,Value> getValues(List<? extends LocalVariable> variables); 
    public void  setValue(LocalVariable variable, Value value) throws InvalidTypeException, ClassNotLoadedException; 
 
    List<Value> getArgumentValues(); 
 
}