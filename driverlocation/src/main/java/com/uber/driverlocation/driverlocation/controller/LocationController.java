package com.uber.driverlocation.driverlocation.controller;

import com.uber.driverlocation.driverlocation.service.KafkaMessagingService;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {
    Logger LOGGER = LoggerFactory.getLogger(LocationController.class);
    @Autowired
    KafkaMessagingService kafkaMessagingService;

    @PostMapping("/update")
    public ResponseEntity<String> updateLocation(){
        for (int i =0; i < 100000; i++){
            LOGGER.info("produced updated driver location for instance {}", i);
            kafkaMessagingService.updateLocation("("+Math.random()*100+", "+Math.random()*100+")");
        }
        return new ResponseEntity<>("driver location updated", HttpStatus.OK);
    }
}
