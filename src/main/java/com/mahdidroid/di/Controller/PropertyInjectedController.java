package com.mahdidroid.di.Controller;

import com.mahdidroid.di.Services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }




}
