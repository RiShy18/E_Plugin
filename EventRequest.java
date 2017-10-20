package com.jdi.request;
import com.jdi.*; 

public interface EventRequest extends Mirror { 
 
    boolean isEnabled();
    public void setEnabled(boolean val); 

    public void enable(); 
    public void  disable(); 
    public void  addCountFilter(int count); 
 
    /** Suspend no threads when the event occurs */ 
    int SUSPEND_NONE = 0; 
    /** Suspend only the thread which generated the event when the event occurs */ 
    int SUSPEND_EVENT_THREAD = 1; 
    /** Suspend all threads when the event occurs */ 
    int SUSPEND_ALL = 2;
    public void setSuspendPolicy(int policy); 
 
    int suspendPolicy(); 
    public void  putProperty(Object key, Object value); 
    Object getProperty(Object key); 
}
