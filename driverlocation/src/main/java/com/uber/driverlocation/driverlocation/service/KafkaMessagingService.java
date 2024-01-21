package com.uber.driverlocation.driverlocation.service;

import com.uber.driverlocation.driverlocation.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessagingService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location){
        kafkaTemplate.send(AppConstants.DRIVER_LOCATION_TOPIC, location);
        return true;
    }
}
