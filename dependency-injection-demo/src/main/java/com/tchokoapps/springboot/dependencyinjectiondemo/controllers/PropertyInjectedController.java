package com.tchokoapps.springboot.dependencyinjectiondemo.controllers;

import com.tchokoapps.springboot.dependencyinjectiondemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
