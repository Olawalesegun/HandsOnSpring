package com.orangekapital.springer.beans;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Normal Java without having anything to do with the management
        // by Inversion of Control container
        Vehicle vehicle = new Vehicle();
        vehicle.setName("VOLVO 2006");
        System.out.println("This vehicle "+ vehicle.getName() +
                " has nothing to do with spring context.");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("This is the Spring object being managed by IOC container "+ veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("and in Semicolon, we say " + hello);
    }
}
