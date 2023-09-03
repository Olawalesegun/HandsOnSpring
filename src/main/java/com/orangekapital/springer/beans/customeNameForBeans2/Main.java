package com.orangekapital.springer.beans.customeNameForBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectCustomNameConfig.class);
        House house = context.getBean(House.class);
        House house2 = context.getBean("Mountains", House.class);
        System.out.println(house.getHouseName());
        System.out.println(house2.getHouseName());
    }
}
