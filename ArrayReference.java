package com.jdi;

import java.util.List; 

public interface ArrayReference extends ObjectReference { 
 
  
    int length(); 
 

    Value getValue(int index); 

    List<Value> getValues(); 
 
   
    List<Value> getValues(int index, int length); 
 
    public void  setValue(int index, Value value)throws InvalidTypeException,ClassNotLoadedException; 
 
    public void  setValues(List<? extends Value> values)throws InvalidTypeException,ClassNotLoadedException; 
    public void  setValues(int index, List<? extends Value> values, int srcIndex, int length)throws InvalidTypeException,ClassNotLoadedException; 
}
