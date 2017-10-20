package com.jdi.event;

import java.util.List;

import com.jdi.*; 

public interface LocatableEvent extends Event, Locatable { 
    public ThreadReference thread(); 
}