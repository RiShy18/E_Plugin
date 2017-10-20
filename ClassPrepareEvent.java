package com.jdi.event;

import com.jdi.*; 

public interface ClassPrepareEvent extends Event { 
   
    public ThreadReference thread(); 
    public ReferenceType referenceType(); 
}
