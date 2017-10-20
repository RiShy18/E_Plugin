package com.jdi.event;

import com.jdi.*; 

public interface MethodExitEvent extends LocatableEvent { 
 
    public Method method(); 
    public Value returnValue(); 
}