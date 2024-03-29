package com.tchokoapps.springboot.dependencyinjectiondemo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    private final Logger logger = LoggerFactory.getLogger(GreetingServiceImpl.class);

    @Override
    public String sayGreeting() {
        String message = "Hello - from GreetingServiceImpl";
        logger.info(message);
        return message;
    }
}
