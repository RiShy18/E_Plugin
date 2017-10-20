package com.jdi.event;

import com.jdi.*; 

public interface ExceptionEvent extends LocatableEvent { 
    public ObjectReference exception(); 
    public Location catchLocation(); 
}