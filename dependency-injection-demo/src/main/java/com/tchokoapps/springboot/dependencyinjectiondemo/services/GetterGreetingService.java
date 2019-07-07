package com.tchokoapps.springboot.dependencyinjectiondemo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    private final Logger logger = LoggerFactory.getLogger(GetterGreetingService.class);

    @Override
    public String sayGreeting() {

        String message = "Hello - I was injected by the getter";
        logger.info(message);
        return message;
    }
}
