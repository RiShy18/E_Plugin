package com.jdi.event;

import com.jdi.*; 
public interface ModificationWatchpointEvent extends WatchpointEvent { 
    Value valueToBe(); 
}