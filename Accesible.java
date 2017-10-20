package com.jdi;


public interface Accesible { 
 

    public int modifiers(); 
 
    public boolean isPrivate(); 
 
    public boolean isPackagePrivate(); 
 
    public boolean isProtected(); 
 
    public boolean isPublic(); 
}