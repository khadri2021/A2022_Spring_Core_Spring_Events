package com.khadri.spring.core.events.order;

public class LootEvent {

    private String lootOffer;

    private Double offerPrice;


    public LootEvent(String lootOffer,Double offerPrice) {
        this.lootOffer = lootOffer;
        this.offerPrice = offerPrice;
    }

    public String getLootOffer() {
        return lootOffer;
    }

    public Double getOfferPrice() {
        return offerPrice;
    }
}
