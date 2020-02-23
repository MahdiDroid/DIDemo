package com.mahdidroid.di.Services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "salam I was injected  by the getter";
    }
}
