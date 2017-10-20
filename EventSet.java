package com.jdi.event;

import java.util.Set;

import com.jdi.*; 
 
 
public interface EventSet extends Mirror, Set<Event> { 
    int suspendPolicy(); 
    void resume(); 
}
