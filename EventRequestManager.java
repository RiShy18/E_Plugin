package com.jdi.request;
import java.util.List;

import com.jdi.*; 
 
public interface EventRequestManager extends Mirror { 
 

    ClassPrepareRequest createClassPrepareRequest(); 
    ClassUnloadRequest createClassUnloadRequest(); 
    ThreadStartRequest createThreadStartRequest(); 
    ThreadDeathRequest createThreadDeathRequest(); 
    ExceptionRequest createExceptionRequest(ReferenceType refType,boolean notifyCaught, boolean notifyUncaught); 
    MethodEntryRequest createMethodEntryRequest(); 
    MethodExitRequest createMethodExitRequest(); 
    MonitorContendedEnteredRequest createMonitorContendedEnterRequest(); 
    MonitorContendedEnteredRequest createMonitorContendedEnteredRequest(); 
    MonitorWaitRequest createMonitorWaitRequest(); 
    MonitorWaitedRequest createMonitorWaitedRequest(); 
    StepRequest createStepRequest(ThreadReference thread,int size, int depth); 
    BreakpointRequest createBreakpointRequest(Location location); 
    AccessWatchpointRequest createAccessWatchpointRequest(Field field); 
    ModificationWatchpointRequest createModificationWatchpointRequest(Field field); 
 
    VMDeathRequest createVMDeathRequest(); 
 
    public void deleteEventRequest(EventRequest eventRequest); 
 
    public void deleteEventRequests(List<? extends EventRequest> eventRequests); 
 
    public void deleteAllBreakpoints(); 
 
    List<StepRequest> stepRequests(); 
 
    List<ClassPrepareRequest> classPrepareRequests(); 
 
    List<ClassUnloadRequest> classUnloadRequests(); 

    List<ThreadStartRequest> threadStartRequests(); 
 
    List<ThreadDeathRequest> threadDeathRequests(); 
    List<ExceptionRequest> exceptionRequests(); 
    List<BreakpointRequest> breakpointRequests(); 

    List<AccessWatchpointRequest> accessWatchpointRequests(); 

    List<ModificationWatchpointRequest> modificationWatchpointRequests(); 

    List<MethodEntryRequest> methodEntryRequests(); 
 

    List<MethodExitRequest> methodExitRequests(); 
 

    List<MonitorContendedEnteredRequest> monitorContendedEnterRequests(); 
 
    List<MonitorContendedEnteredRequest> monitorContendedEnteredRequests(); 

    List<MonitorWaitRequest> monitorWaitRequests(); 
 
    List<MonitorWaitedRequest> monitorWaitedRequests(); 
 
  
    List<VMDeathRequest> vmDeathRequests(); 
}