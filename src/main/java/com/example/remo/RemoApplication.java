package com.example.remo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(RemoApplication.class);

	public static void main(String[] args) {
		logger.info("Starting RemoApplication...");
		SpringApplication.run(RemoApplication.class, args);
		logger.info("RemoApplication started successfully.");
	}
}

