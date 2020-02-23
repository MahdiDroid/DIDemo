package com.mahdidroid.di.Services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("deu")
public class PrimeryGermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "primaere Grussdienst";
    }
}
