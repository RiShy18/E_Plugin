package com.jdi;

public class Bootstrap extends Object {
	static public synchronized VirtualMachineManager virtualMachineManager() { 
        return com.tools.VirtualMachineManagerImpl.virtualMachineManager(); 
    } 
}