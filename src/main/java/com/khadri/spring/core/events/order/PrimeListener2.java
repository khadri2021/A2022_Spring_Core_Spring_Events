package com.khadri.spring.core.events.order;


import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class PrimeListener2 {

    public void grabOffer(String lootOffer, Double price) {
        System.out.println("PrimeListener2 Grabbing the offer " + lootOffer + " price " + price);
    }

    @EventListener
    @Order(1)
    public void eventListener(LootEvent event) {
        this.grabOffer(event.getLootOffer(),event.getOfferPrice());
    }
}
