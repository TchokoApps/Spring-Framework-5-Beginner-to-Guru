package com.tchokoapps.springboot.dependencyinjectiondemo.controllers;

import com.tchokoapps.springboot.dependencyinjectiondemo.services.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    private final Logger logger = LoggerFactory.getLogger(MyController.class);

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        return greetingService.sayGreeting();
    }
}
