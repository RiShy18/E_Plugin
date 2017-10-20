package com.jdi.request;

import com.jdi.*; 

public interface ClassUnloadRequest extends EventRequest { 
	public void addClassFilter(String classPattern); 
	public void  addClassExclusionFilter(String classPattern); 
}

