package com.jdi.request;

import com.jdi.*; 


public interface WatchpointRequest extends EventRequest { 

    Field field(); 
    public void addThreadFilter(ThreadReference thread); 
    public void addClassFilter(ReferenceType refType); 
    public void addClassFilter(String classPattern); 
    public void addClassExclusionFilter(String classPattern); 
    void addInstanceFilter(ObjectReference instance); 
}