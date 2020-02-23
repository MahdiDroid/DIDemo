package com.mahdidroid.di;


import com.mahdidroid.di.Controller.PropertyInjectedController;
import com.mahdidroid.di.Services.PropertyGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController= new PropertyInjectedController();
        this.propertyInjectedController.propertyGreetingService = new PropertyGreetingService();

    }
    @Test
     public void testGreeting()  throws Exception{
        assertEquals(PropertyGreetingService.Hello_folks, propertyInjectedController.sayHello());
    }


}
