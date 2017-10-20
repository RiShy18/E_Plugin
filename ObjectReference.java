package com.jdi;

import java.util.List; 
import java.util.Map; 
 
public interface ObjectReference extends Value 
{ 
    
    ReferenceType referenceType(); 

    Value getValue(Field sig); 

    Map<Field,Value> getValues(List<? extends Field> fields); 
 
    public void  setValue(Field field, Value value) throws InvalidTypeException, ClassNotLoadedException; 
 
    /** Perform method invocation with only the invoking thread resumed */ 
    static final int INVOKE_SINGLE_THREADED = 0x1; 
    /** Perform non-virtual method invocation */ 
    static final int INVOKE_NONVIRTUAL      = 0x2; 
 
    Value invokeMethod(ThreadReference thread, Method method, List<? extends Value> arguments, int options) throws InvalidTypeException,ClassNotLoadedException,IncompatibleThreadStateException,InvocationException; 
 
   
    public void disableCollection(); 
    public void enableCollection(); 
    public boolean isCollected(); 
 
   
    long uniqueID(); 
 
    List<ThreadReference> waitingThreads()throws IncompatibleThreadStateException; 
 
 
    ThreadReference owningThread() throws IncompatibleThreadStateException; 
 
  
    int entryCount() throws IncompatibleThreadStateException; 
 
    
    List<ObjectReference> referringObjects(long maxReferrers); 
 
 
    boolean equals(Object obj); 
 
    int hashCode(); 
}