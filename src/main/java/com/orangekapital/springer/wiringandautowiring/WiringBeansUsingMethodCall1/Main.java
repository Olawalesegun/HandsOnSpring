package com.orangekapital.springer.wiringandautowiring.WiringBeansUsingMethodCall1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name is " + veh.getName());

        Person person = context.getBean(Person.class);
        System.out.println("Person name is " + person.getPersonName());
        System.out.println(person.getVehicle());

    }
}
