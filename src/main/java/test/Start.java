package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        HelloWorld helloWorldService = (HelloWorld) context.getBean("helloWorldService");

        System.out.println(helloWorldService.getName());
    }

}
