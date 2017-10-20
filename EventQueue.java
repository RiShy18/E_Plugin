package com.jdi.event;

import com.jdi.*; 
 
public interface EventQueue extends Mirror { 
 
    EventSet remove() throws InterruptedException; 
    EventSet remove(long timeout) throws InterruptedException; 
}