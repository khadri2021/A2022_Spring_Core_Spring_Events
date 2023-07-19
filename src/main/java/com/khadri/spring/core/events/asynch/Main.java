package com.khadri.spring.core.events.asynch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
        AmazonPrimeDayPublisher primeDayPublisher = context.getBean(AmazonPrimeDayPublisher.class);
        primeDayPublisher.publishOffers("WoodLand",100.89);
        primeDayPublisher.publishOffers("Smart Watch",200.98);
    }
}