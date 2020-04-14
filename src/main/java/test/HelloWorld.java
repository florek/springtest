package test;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorld {
    private String name;
    private int age;
    private String address;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void sayHello() {
        System.out.println(name + " " + address + " " + age);
    }
}
