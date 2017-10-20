package com.jdi.request;


import com.jdi.*; 

public interface StepRequest extends EventRequest { 

   /** Step into any newly pushed frames */ 
   int STEP_INTO = 1; 
   /** Step over any newly pushed frames */ 
   int STEP_OVER = 2; 
   /** Step out of the current frame */ 
   int STEP_OUT = 3; 
   /** Step to the next available location */ 
   int STEP_MIN = -1; 
   /** Step to the next location on a different line */ 
   int STEP_LINE = -2; 

   ThreadReference thread();  
   int size(); 
   int depth();
   public void addClassFilter(ReferenceType refType); 
   public void addClassFilter(String classPattern); 
   public void addClassExclusionFilter(String classPattern); 
   public void addInstanceFilter(ObjectReference instance); 
}
