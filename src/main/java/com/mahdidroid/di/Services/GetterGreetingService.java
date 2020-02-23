package com.mahdidroid.di.Services;

public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "salam I was injected  by the getter";
    }
}
