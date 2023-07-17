package com.khadri.spring.core.events.need;


import org.springframework.stereotype.Component;

@Component
public class PrimeListener1 {

    public void grabOffer(String lootOffer){
        System.out.println("PrimeListener1 Grabbing the offer "+lootOffer);
    }
}
