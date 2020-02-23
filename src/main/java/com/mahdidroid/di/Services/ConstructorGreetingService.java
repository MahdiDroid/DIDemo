package com.mahdidroid.di.Services;

public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "hallo i was injected via the constructor ";
    }
}
