package com.khadri.spring.core.events.need;


import org.springframework.stereotype.Component;

@Component
public class PrimeListener3 {

    public void grabOffer(String lootOffer){
        System.out.println("PrimeListener2 Grabbing the offer "+lootOffer);
    }
}
