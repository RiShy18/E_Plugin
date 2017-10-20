package com.jdi.event;

import com.jdi.*; 

public interface MonitorWaitedEvent extends LocatableEvent { 
 
    public ThreadReference thread(); 
    public ObjectReference  monitor(); 
    public boolean  timedout(); 
 
 
}
