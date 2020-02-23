package com.mahdidroid.di;


import com.mahdidroid.di.Controller.PropertyInjectedController;
import com.mahdidroid.di.Services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.Assert.assertEquals;
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController= new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();

    }
    @Test
     public void testGreeting()  throws Exception{
        assertEquals(GreetingServiceImpl.Hello_folks, propertyInjectedController.sayHello());
    }


}