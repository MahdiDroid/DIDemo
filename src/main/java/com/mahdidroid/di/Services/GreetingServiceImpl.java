package com.mahdidroid.di.Services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

public static final String Hello_folks = "Hello Folks";
    @Override
    public String sayGreeting() {
        return Hello_folks;
    }
}
