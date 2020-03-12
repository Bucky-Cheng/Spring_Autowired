package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args ) throws IOException {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring_auto.xml");

        AutoService as=(AutoService) context.getBean("autoService");
        as.say("TEST!!");
        as.itself();
        ResourceTest rt=(ResourceTest) context.getBean("res");
        rt.getResource(context);
    }
}
