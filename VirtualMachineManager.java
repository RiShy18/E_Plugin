package com.jdi;
import com.jdi.connect.*;
import com.jdi.connect.spi.Connection;

import java.util.List; 
import java.io.IOException; 

public interface VirtualMachineManager { 

    LaunchingConnector defaultConnector(); 
    List<LaunchingConnector> launchingConnectors(); 
    List<AttachingConnector> attachingConnectors(); 
    List<ListeningConnector> listeningConnectors(); 
    List<Connector> allConnectors(); 
    List<VirtualMachine> connectedVirtualMachines(); 
    int majorInterfaceVersion(); 
    int minorInterfaceVersion(); 
    VirtualMachine createVirtualMachine(Connection connection, Process process) throws IOException; 
    VirtualMachine createVirtualMachine(Connection connection) throws IOException; 
}
