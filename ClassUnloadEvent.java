package com.jdi.event;

import com.jdi.*; 

public interface ClassUnloadEvent extends Event {  
    public String className(); 
    public String classSignature(); 
}