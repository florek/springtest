package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        HelloWorld helloWorldService = (HelloWorld) context.getBean("helloWorldService");

        helloWorldService.sayHello();
    }

}
