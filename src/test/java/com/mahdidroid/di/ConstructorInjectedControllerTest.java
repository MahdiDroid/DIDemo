package com.mahdidroid.di;

import com.mahdidroid.di.Controller.ConstructorInjectedController;
import com.mahdidroid.di.Services.PropertyGreetingService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;


    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController= new ConstructorInjectedController(new PropertyGreetingService());
    }
    @Test
    public void testGreeting() throws Exception{
        assertEquals(PropertyGreetingService.Hello_folks,constructorInjectedController.sayHello());
    }
}
