package com.khadri.spring.core.events.programatic;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class PrimeListener1 implements ApplicationListener<LootEvent> {

    public void grabOffer(String lootOffer) {
        System.out.println("PrimeListener1 Grabbing the offer " + lootOffer);
    }

    @Override
    public void onApplicationEvent(LootEvent event) {
        this.grabOffer(event.getLootOffer());
    }
}
