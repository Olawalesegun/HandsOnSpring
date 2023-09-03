package com.orangekapital.springer.beans.noUniqueBeanDefinitionException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectNoUniqueBeanConfig.class);
        RealEstate realEstate = context.getBean(RealEstate.class);
        System.out.println("This estate name is " + realEstate.getEstateName());

        // The code above will lead to NoUniqueBeanDefinitionException to solve this, we have to
        // specify the specific bean we are addressing, and this can be done by stating the method name
        // alongside the bean type name, so we have 2 arguments in the parameter.

        /*var context = new AnnotationConfigApplicationContext(ProjectNoUniqueBeanConfig.class);
        RealEstate realEstate = context.getBean("realEstate3",RealEstate.class);
        System.out.println("This estate name is " + realEstate.getEstateName());*/

    }
}
