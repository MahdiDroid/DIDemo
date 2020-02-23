package com.mahdidroid.di.Services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimeryEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo from the primery greeting service";
    }
}
