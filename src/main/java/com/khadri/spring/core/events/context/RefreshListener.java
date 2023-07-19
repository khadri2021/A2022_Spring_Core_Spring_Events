package com.khadri.spring.core.events.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

public class RefreshListener {
    @EventListener(ContextRefreshedEvent.class)
    public void refreshEventListener(ContextRefreshedEvent event) {
        System.out.println("RefreshListener Listened");
        System.out.println(event);
        System.out.println("Context Refreshed");
    }
}
