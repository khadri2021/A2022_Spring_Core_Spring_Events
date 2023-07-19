package com.khadri.spring.core.events.asynch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AmazonPrimeDayPublisher {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishOffers(String loot1,Double price) {
        System.out.println("published loot offers : " + loot1);
        publisher.publishEvent(new LootEvent(loot1,price));
    }
}
