package com.jdi.event;

import java.util.Iterator;

import com.jdi.*; 
 
public interface EventIterator extends Iterator<Event> { 
    Event nextEvent(); 
}