package com.jdi;


 
public interface LocalVariable extends Mirror, Comparable<LocalVariable> { 
 
    String name(); 
 
    String typeName(); 
 
    
    Type type() throws ClassNotLoadedException; 
 
    
    String signature(); 
 
   
    String genericSignature(); 

    public boolean isVisible(StackFrame frame); 
 
    public boolean isArgument(); 
 
    public boolean equals(Object obj); 

    int hashCode(); 
}
