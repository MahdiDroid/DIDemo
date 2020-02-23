package com.mahdidroid.di.Services;

public class PrimeryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo from the primery greeting service";
    }
}
