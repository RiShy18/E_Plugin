package com.jdi.request;

import com.jdi.*;

public interface MonitorWaitedRequest extends EventRequest { 
	 
	public void addThreadFilter(ThreadReference thread); 
	public void addClassFilter(ReferenceType refType); 
	public void addClassFilter(String classPattern); 
	public void addClassExclusionFilter(String classPattern); 
	public void addInstanceFilter(ObjectReference instance); 
}