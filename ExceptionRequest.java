package com.jdi.request;

import com.jdi.*; 
public interface ExceptionRequest extends EventRequest { 
 
    ReferenceType exception(); 
    public boolean notifyCaught(); 
    public boolean notifyUncaught(); 
    public void  addThreadFilter(ThreadReference thread); 
    public void  addClassFilter(ReferenceType refType); 
    public void addClassFilter(String classPattern); 
    public void addClassExclusionFilter(String classPattern); 
    public void  addInstanceFilter(ObjectReference instance); 
}