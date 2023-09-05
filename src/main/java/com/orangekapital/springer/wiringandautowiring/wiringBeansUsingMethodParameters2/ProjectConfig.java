package com.orangekapital.springer.wiringandautowiring.wiringBeansUsingMethodParameters2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.orangekapital.springer.wiringandautowiring.wiringBeansUsingMethodParameters2")
public class ProjectConfig {
    @Bean
    Vehicle vehicle(){
        var vehicle = new Vehicle();
        vehicle.setName("Nissan");
        return vehicle;
    }
    @Bean
    Person person(Vehicle vehicle){
        var person = new Person();
        person.setName("Jibola Dabo");
        person.setVehicle(vehicle);
        return person;
    }
}
