package com.jdi.connect;

import java.util.Map;

import com.jdi.VirtualMachine;

import java.io.IOException; 

public interface LaunchingConnector extends Connector{
	VirtualMachine launch(Map<String,? extends Connector.Argument> arguments) throws IOException, IllegalConnectorArgumentsException, VMStartException; 
}
