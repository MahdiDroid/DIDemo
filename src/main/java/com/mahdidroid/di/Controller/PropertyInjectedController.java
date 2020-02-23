package com.mahdidroid.di.Controller;

import com.mahdidroid.di.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService propertyGreetingService;

    public String sayHello(){
        return propertyGreetingService.sayGreeting();
    }




}
