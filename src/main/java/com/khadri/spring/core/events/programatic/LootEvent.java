package com.khadri.spring.core.events.programatic;

import org.springframework.context.ApplicationEvent;

public class LootEvent extends ApplicationEvent {

    private  String lootOffer;
    public LootEvent(Object source) {
        super(source);
    }

    public LootEvent(Object source, String lootOffer) {
        super(source);
        this.lootOffer = lootOffer;
    }

    public String getLootOffer() {
        return lootOffer;
    }
}
