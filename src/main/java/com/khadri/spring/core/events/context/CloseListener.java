package com.khadri.spring.core.events.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;

public class CloseListener{

    @EventListener
    public void closeListener(ContextClosedEvent event) {
        System.out.println("CloseListener Listened");
        System.out.println(event);
        System.out.println("Context closed");
    }
}
