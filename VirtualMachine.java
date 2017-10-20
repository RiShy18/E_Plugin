package com.jdi;

import com.jdi.event.EventQueue;
import com.jdi.request.EventRequestManager;

import java.util.List; 
import java.util.Map; 
 
public interface VirtualMachine extends Mirror{
	List<ReferenceType> classesByName(String className);
	List<ReferenceType> allClasses();
	List<ThreadReference> allThreads();
	public void suspend();
	public void  resume(); 
	List<ThreadGroupReference> topLevelThreadGroups();
	EventQueue eventQueue();
	EventRequestManager eventRequestManager();
	BooleanValue mirrorOf(boolean value); 
	ByteValue mirrorOf(byte value); 
	CharValue mirrorOf(char value);
	ShortValue mirrorOf(short value);
	IntegerValue mirrorOf(int value);
	LongValue mirrorOf(long value); 
	FloatValue mirrorOf(float value);
	DoubleValue mirrorOf(double value);
	StringReference mirrorOf(String value);
	VoidValue mirrorOfVoid(); 
	Process process();
	public void dispose();
	
	public void exit(int exitCode);
	public boolean canWatchFieldModification(); 
	public boolean canWatchFieldAccess(); 
	public boolean canGetBytecodes(); 
	public boolean canGetSyntheticAttribute(); 
	public boolean canGetOwnedMonitorInfo(); 
	public boolean canGetCurrentContendedMonitor(); 
	public boolean canGetMonitorInfo(); 
	public boolean canUseInstanceFilters(); 
	public boolean canRedefineClasses(); 
	public boolean canAddMethod(); 
	public boolean canUnrestrictedlyRedefineClasses(); 
	public boolean canPopFrames(); 
	public boolean canGetSourceDebugExtension(); 
	public boolean canRequestVMDeathEvent(); 
	public boolean canGetMethodReturnValues(); 
	public boolean canGetInstanceInfo(); 
	public boolean canUseSourceNameFilters(); 
	public boolean canForceEarlyReturn(); 
	public boolean canBeModified(); 
	public boolean canRequestMonitorEvents(); 
	public boolean canGetMonitorFrameInfo(); 
	public boolean canGetClassFileVersion(); 
	public boolean canGetConstantPool(); 
	
	public void setDefaultStratum(String stratum); 
    String getDefaultStratum(); 
    long[] instanceCounts(List<? extends ReferenceType> refTypes); 
    String description(); 
    String version();
    String name(); 
 
    /** All tracing is disabled. */ 
    int TRACE_NONE        = 0x00000000; 
    /** Tracing enabled for JDWP packets sent to target VM. */ 
    int TRACE_SENDS       = 0x00000001; 
    /** Tracing enabled for JDWP packets received from target VM. */ 
    int TRACE_RECEIVES    = 0x00000002; 
    /** Tracing enabled for internal event handling. */ 
    int TRACE_EVENTS      = 0x00000004; 
    /** Tracing enabled for internal managment of reference types. */ 
    int TRACE_REFTYPES    = 0x00000008; 
    /** Tracing enabled for internal management of object references. */ 
    int TRACE_OBJREFS      = 0x00000010; 
    /** All tracing is enabled. */ 
    int TRACE_ALL         = 0x00ffffff; 

    void setDebugTraceMode(int traceFlags); 
	
}
