package test;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorld {
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
