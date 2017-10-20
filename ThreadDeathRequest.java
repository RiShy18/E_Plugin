package com.jdi.request;

import com.jdi.*; 

public interface ThreadDeathRequest extends EventRequest { 
    void addThreadFilter(ThreadReference thread); 
}