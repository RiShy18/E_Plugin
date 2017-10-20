package com.jdi;


import java.util.List; 


public interface PathSearchingVirtualMachine extends VirtualMachine { 
  
   List<String> classPath(); 

   List<String> bootClassPath(); 
   String baseDirectory(); 
}