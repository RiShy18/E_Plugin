package com.jdi.event;

import com.jdi.*; 

public interface MethodEntryEvent extends LocatableEvent { 
    public Method method(); 
}