package com.khadri.spring.core.events.asynch;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan(basePackages = "com.khadri.spring.core.events.asynch")
@EnableAsync
public class AppConfig {
//    @Bean(name="applicationEventMulticaster")
//    public ApplicationEventMulticaster objectCreation(){
//        SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
//        multicaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
//        return  multicaster;
//    }
}