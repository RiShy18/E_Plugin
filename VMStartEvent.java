package com.jdi.event;

import com.jdi.*; 


public interface VMStartEvent extends Event { 
    public ThreadReference thread(); 
}
