package com.jdi.event;
import com.jdi.*; 

public interface MonitorContendedEnteredEvent extends LocatableEvent { 
  
    public ThreadReference thread(); 
    public ObjectReference  monitor(); 
 
}
