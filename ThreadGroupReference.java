package com.jdi;

import java.util.List; 

public interface ThreadGroupReference extends ObjectReference 
{ 
     
    String name(); 
 
    ThreadGroupReference parent(); 
    public void suspend(); 
 
    public void resume(); 
 
    List<ThreadReference> threads(); 
 
    List<ThreadGroupReference> threadGroups(); 
}