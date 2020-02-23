package com.mahdidroid.di.Controller;


import com.mahdidroid.di.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("hello!!!!");
        return greetingService.sayGreeting() ;
    }
}
