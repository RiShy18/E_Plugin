package com.jdi;


 
public interface MonitorInfo extends Mirror { 

    public ObjectReference monitor(); 
 
    public int stackDepth(); 
 

    ThreadReference thread(); 
}