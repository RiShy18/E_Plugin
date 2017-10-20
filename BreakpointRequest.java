package com.jdi.request;

import com.jdi.*; 

public interface BreakpointRequest extends EventRequest, Locatable { 
 
    Location location(); 
    public void addThreadFilter(ThreadReference thread); 
    public void  addInstanceFilter(ObjectReference instance); 
}
