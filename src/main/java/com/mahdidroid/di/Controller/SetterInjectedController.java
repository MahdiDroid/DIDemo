package com.mahdidroid.di.Controller;

import com.mahdidroid.di.Services.GreetingService;
import com.mahdidroid.di.Services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService  greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
