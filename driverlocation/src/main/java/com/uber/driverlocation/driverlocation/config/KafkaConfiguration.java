package com.uber.driverlocation.driverlocation.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {

    @Bean
    private NewTopic createTopic(){
        return TopicBuilder.name(AppConstants.DRIVER_LOCATION_TOPIC)
                .partitions(3)
                .replicas(1)
                .build();
    }
}
