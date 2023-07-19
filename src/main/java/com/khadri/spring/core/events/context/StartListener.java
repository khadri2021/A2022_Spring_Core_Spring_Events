package com.khadri.spring.core.events.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;

public class StartListener{
    @EventListener
    public void startListener(ContextStartedEvent event) {
        System.out.println("StartListener Listened");
        System.out.println(event);
        System.out.println("context on start");
    }
}
