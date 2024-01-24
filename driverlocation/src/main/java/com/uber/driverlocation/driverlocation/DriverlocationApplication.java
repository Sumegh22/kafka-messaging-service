package com.uber.driverlocation.driverlocation;

import com.uber.driverlocation.driverlocation.config.KafkaConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DriverlocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverlocationApplication.class, args);
	}

}
