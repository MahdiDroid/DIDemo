package com.mahdidroid.di;

import com.mahdidroid.di.Controller.ConstructorInjectedController;
import com.mahdidroid.di.Controller.MyController;
import com.mahdidroid.di.Controller.PropertyInjectedController;
import com.mahdidroid.di.Controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args)
    {
       ApplicationContext ctx= SpringApplication.run(DiApplication.class, args);
       //MyController controller = (MyController)ctx.getBean(("myController"));
       //controller.hello();
        System.out.println(ctx.getBean(MyController.class).hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());

        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
       System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}
