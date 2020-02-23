package com.mahdidroid.di;

import com.mahdidroid.di.Controller.SetterInjectedController;
import com.mahdidroid.di.Services.PropertyGreetingService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedController =new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new PropertyGreetingService());

    }

    @Test
    public void testGreeting()throws Exception{
        assertEquals(PropertyGreetingService.Hello_folks,setterInjectedController.sayHello());
    }

}
