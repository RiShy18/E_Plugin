package com.jdi.event;
import com.jdi.*; 


public interface WatchpointEvent extends LocatableEvent { 

    Field field(); 

    ObjectReference object(); 
   
    Value valueCurrent(); 
}