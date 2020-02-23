package com.mahdidroid.di.Services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimeryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo from the primery greeting service";
    }
}
