package com.mahdidroid.di.Services;


import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

public static final String Hello_folks = "merheba form propertiy injected";
    @Override
    public String sayGreeting() {
        return Hello_folks ;
    }
}
