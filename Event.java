package com.jdi.event;

import com.jdi.*;
import com.jdi.request.EventRequest; 

public interface Event extends Mirror {  
    EventRequest request(); 
}