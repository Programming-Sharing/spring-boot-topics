package com.programmingsharing.springboottopics.consumer;

import org.springframework.kafka.annotation.KafkaListener;

public class DemoConsumer {


    @KafkaListener()
    public void consumeEvent(){

    }
}
