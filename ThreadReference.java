package com.jdi;

import java.util.List; 

public interface ThreadReference extends ObjectReference 
{ 
    /** Thread status is unknown */ 
    public final int THREAD_STATUS_UNKNOWN  =-1; 
    /** Thread has completed execution */ 
    public final int THREAD_STATUS_ZOMBIE = 0; 
    /** Thread is runnable */ 
    public final int THREAD_STATUS_RUNNING = 1; 
    /** Thread is sleeping - Thread.sleep() or JVM_Sleep() was called */ 
    public final int THREAD_STATUS_SLEEPING = 2; 
    /** Thread is waiting on a java monitor */ 
    public final int THREAD_STATUS_MONITOR = 3; 
    /** Thread is waiting - Object.wait() or JVM_MonitorWait() was called */ 
    public final int THREAD_STATUS_WAIT = 4; 
    /** Thread has not yet been started */ 
    public final int THREAD_STATUS_NOT_STARTED = 5; 
 
    String name(); 
 
    public void suspend(); 

    public void resume(); 
 
    int suspendCount(); 
 
    public void stop(ObjectReference throwable) throws InvalidTypeException; 
  
    public void interrupt(); 
 
    int status(); 
  
    public boolean isSuspended(); 
 
    
    public boolean isAtBreakpoint(); 
 
    ThreadGroupReference threadGroup(); 

    int frameCount() throws IncompatibleThreadStateException; 
 
    List<StackFrame> frames() throws IncompatibleThreadStateException; 
 
    StackFrame frame(int index) throws IncompatibleThreadStateException; 
 
   
    List<StackFrame> frames(int start, int length) throws IncompatibleThreadStateException; 
 
  
    List<ObjectReference> ownedMonitors()throws IncompatibleThreadStateException; 
 
    
    List<MonitorInfo> ownedMonitorsAndFrames() throws IncompatibleThreadStateException; 
 
    
    ObjectReference currentContendedMonitor() throws IncompatibleThreadStateException; 
 
    public void popFrames(StackFrame frame) throws IncompatibleThreadStateException; 
    public void forceEarlyReturn(Value value) throws InvalidTypeException, ClassNotLoadedException,  IncompatibleThreadStateException;
}
