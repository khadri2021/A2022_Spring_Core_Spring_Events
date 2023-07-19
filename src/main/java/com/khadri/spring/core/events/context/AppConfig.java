package com.khadri.spring.core.events.context;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public RefreshListener refreshListener() {
        return new RefreshListener();
    }

    @Bean
    public StartListener startListener() {
        return new StartListener();
    }

    @Bean
    public StopListener stopListener() {
        return new StopListener();
    }

    @Bean
    public CloseListener closeListener(){
        return  new CloseListener();
    }
}