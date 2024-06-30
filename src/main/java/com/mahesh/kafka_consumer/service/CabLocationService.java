package com.mahesh.kafka_consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void cabLocations(String location){
        System.out.println(location);
    }
}
