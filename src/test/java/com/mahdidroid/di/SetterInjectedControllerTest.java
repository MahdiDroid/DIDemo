package com.mahdidroid.di;

import com.mahdidroid.di.Controller.SetterInjectedController;
import com.mahdidroid.di.Services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedController =new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting()throws Exception{
        assertEquals(GreetingServiceImpl.Hello_folks,setterInjectedController.sayHello());
    }

}
