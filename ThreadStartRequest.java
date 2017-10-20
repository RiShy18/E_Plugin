package com.jdi.request;

import com.jdi.*; 

public interface ThreadStartRequest extends EventRequest { 
  
    public void addThreadFilter(ThreadReference thread); 
}