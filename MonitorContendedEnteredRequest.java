package com.jdi.request;

import com.jdi.*; 

public interface MonitorContendedEnteredRequest extends EventRequest { 

	public void addThreadFilter(ThreadReference thread); 
	public void addClassFilter(ReferenceType refType); 
	public void addClassExclusionFilter(String classPattern); 
	public void addInstanceFilter(ObjectReference instance); 
}
