package com.orangekapital.springer.beans.noUniqueBeanDefinitionException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectNoUniqueBeanConfig {
    @Bean
    RealEstate realEstate(){
        var realEst = new RealEstate();
        realEst.setEstateName("Victoria Garden City");
        return realEst;
    }
    @Bean
    RealEstate realEstate2(){
        var realEst2 = new RealEstate();
        realEst2.setEstateName("Creek Estate PortHarcourt");
        return realEst2;
    }
    @Bean
    RealEstate realEstate3(){
        var realEst3 = new RealEstate();
        realEst3.setEstateName("Otedola Estate, Magodo");
        return realEst3;
    }
}
