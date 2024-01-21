package com.uber.driverlocation.driverlocation.controller;

import com.uber.driverlocation.driverlocation.service.KafkaMessagingService;
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

    @Autowired
    KafkaMessagingService kafkaMessagingService;

    @PostMapping("/update")
    public ResponseEntity<String> updateLocation(){
        kafkaMessagingService.updateLocation("("+Math.random()*100+", "+Math.random()*100+")");
        return new ResponseEntity<>("driver location updated", HttpStatus.OK);
    }
}
