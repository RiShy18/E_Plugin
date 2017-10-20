package com.jdi.request;

import com.jdi.*; 

public interface ClassPrepareRequest extends EventRequest { 
 
	public void addClassFilter(ReferenceType refType); 
	public void addClassFilter(String classPattern); 
	public void addClassExclusionFilter(String classPattern); 
	public void addSourceNameFilter(String sourceNamePattern); 
}