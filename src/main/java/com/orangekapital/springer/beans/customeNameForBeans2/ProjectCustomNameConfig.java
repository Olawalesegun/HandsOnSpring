package com.orangekapital.springer.beans.customeNameForBeans2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class ProjectCustomNameConfig {

    @Primary
    @Bean(name="Rock")
    House house(){
        var house1 = new House();
        house1.setHouseName("House on the Rock");
        return house1;
    }
    @Bean(value = "Mountains")
    House house2(){
        var house2 = new House();
        house2.setHouseName("House on Mountains");
        return house2;
    }
    @Bean("Pragma")
    House house3(){
        var house3 = new House();
        house3.setHouseName("House pragmatis");
        return house3;
    }

}
