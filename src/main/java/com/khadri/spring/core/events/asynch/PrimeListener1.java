package com.khadri.spring.core.events.asynch;


import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class PrimeListener1 {

    public void grabOffer(String lootOffer, Double price) {
        System.out.println("PrimeListener1 Grabbing the offer " + lootOffer + " price " + price);
    }

    @EventListener
    @Async
    public void eventListener(LootEvent event) throws InterruptedException {
//        event = null;
        Thread.sleep(6000);
        this.grabOffer(event.getLootOffer(),event.getOfferPrice());
    }
}
