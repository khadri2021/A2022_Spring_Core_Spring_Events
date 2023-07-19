package com.khadri.spring.core.events.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

public class StopListener {

    @EventListener
    public void stopListener(ContextStoppedEvent event) {
        System.out.println("StopListener Listened");
        System.out.println(event);
        System.out.println("Context stopped event");
    }
}
