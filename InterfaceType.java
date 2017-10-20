package com.jdi;

import java.util.List; 


public interface InterfaceType extends ReferenceType { 

    List<InterfaceType> superinterfaces(); 
 
    List<InterfaceType> subinterfaces(); 
 
    List<ClassType> implementors(); 
}