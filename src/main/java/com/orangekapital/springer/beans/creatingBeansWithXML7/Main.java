package com.orangekapital.springer.beans.creatingBeansWithXML7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    //Best advise to not do this as xml are not used in creating Beans anymore
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println(veh.getName());
    }
}
