package com.khadri.spring.core.events.need;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmazonPrimeDayPublisher {

    @Autowired
    private PrimeListener1 primeListener1;

    @Autowired
    private  PrimeListener2 primeListener2;

    @Autowired
    private PrimeListener3 primeListener3;

    public void publishOffers(String loot1){
        System.out.println("published loot offers : "+loot1);
        primeListener1.grabOffer(loot1);
        primeListener2.grabOffer(loot1);
        primeListener3.grabOffer(loot1);
    }

}
