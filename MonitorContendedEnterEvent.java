package com.jdi.event;
import com.jdi.*; 

public interface MonitorContendedEnterEvent extends LocatableEvent { 
 
    public ThreadReference thread(); 
    public ObjectReference  monitor(); 
}