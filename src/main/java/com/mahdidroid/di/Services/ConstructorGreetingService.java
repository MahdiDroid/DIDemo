package com.mahdidroid.di.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "hallo i was injected via the constructor ";
    }
}
