package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LogbackDemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(LogbackDemoApplication.class);

    public static void main(String[] args) {
        logger.info("Starting Spring Boot Application...");
        SpringApplication.run(LogbackDemoApplication.class, args);
    }
}

@RestController
@RequestMapping("/log")
class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/test")
    public String logMessage() {
        logger.debug("Debug level log from LogController");
        logger.info("Info level log from LogController");
        logger.error("Error level log from LogController");

        return "Check the logs!";
    }
}
