package com.khadri.spring.core.events.need;


import org.springframework.stereotype.Component;

@Component
public class PrimeListener2 {

    public void grabOffer(String lootOffer){
        System.out.println("PrimeListener2 Grabbing the offer "+lootOffer);
    }
}
