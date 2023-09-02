package com.orangekapital.springer.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Audi 22");
        return vehicle;
    }
    @Bean
    String hello(){
        return "Hi Welcome to Segun trying to understand how " +
                "things work under the hood"+
                "and trying to stop being a whimp";
    }
}
