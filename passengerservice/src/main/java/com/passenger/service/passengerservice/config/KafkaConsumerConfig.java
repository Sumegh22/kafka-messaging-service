package com.passenger.service.passengerservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerConfig.class);
    @KafkaListener(topics = ConsumerAppConstants.DRIVER_LOCATION_TOPIC, groupId = ConsumerAppConstants.GROUP_ID)
    public void updatedDriverLocation( String newLocation){
        LOGGER.info("consumed updated driver location {} ...", newLocation);
    }

}
