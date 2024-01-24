package com.uber.driverlocation.driverlocation.service;

import com.uber.driverlocation.driverlocation.config.ProducerAppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessagingService {

    Logger LOGGER = LoggerFactory.getLogger(KafkaMessagingService.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location){
        LOGGER.info("updating driverLocation with: {}",  location);
        kafkaTemplate.send(ProducerAppConstants.DRIVER_LOCATION_TOPIC, location);
        return true;
    }
}
