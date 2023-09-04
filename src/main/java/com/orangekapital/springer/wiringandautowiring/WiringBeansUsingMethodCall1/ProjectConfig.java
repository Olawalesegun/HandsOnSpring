package com.orangekapital.springer.wiringandautowiring.WiringBeansUsingMethodCall1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.orangekapital.springer.wiringandautowiring.WiringBeansUsingMethodCall1")
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Anaconda55");
        return veh;
    }

    @Bean
    Person person(){
        var person = new Person();
        person.setPersonName("Jibola Balogun");
        person.setVehicle(vehicle());
        return person;
    }
}
