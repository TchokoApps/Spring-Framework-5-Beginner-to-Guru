package com.tchokoapps.springboot.dependencyinjectiondemo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    private final Logger logger = LoggerFactory.getLogger(ConstructorGreetingService.class);

    @Override
    public String sayGreeting() {

        String message = "Hello - I was injected via the constructor!!!";
        logger.info(message);
        return message;
    }
}
