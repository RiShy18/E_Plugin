package com.jdi.event;

import com.jdi.*; 

public interface ThreadDeathEvent extends Event { 
    public ThreadReference thread(); 
}
