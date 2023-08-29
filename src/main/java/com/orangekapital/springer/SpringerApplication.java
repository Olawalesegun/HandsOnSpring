package com.orangekapital.springer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringerApplication.class, args);
    }
    @GetMapping(/home)
    public String sayHi(){
        return "Hello ";
    }

}
