package com.jdi.event;

import com.jdi.*; 

public interface MonitorWaitEvent extends LocatableEvent { 

    public ThreadReference thread(); 
    public ObjectReference  monitor(); 
    public long  timeout(); 
}