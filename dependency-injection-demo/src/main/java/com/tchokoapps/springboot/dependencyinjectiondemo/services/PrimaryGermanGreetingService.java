package com.tchokoapps.springboot.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Primärer Grußdienst";
    }
}
