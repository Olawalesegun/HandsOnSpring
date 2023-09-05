package com.orangekapital.springer.wiringandautowiring.wiringBeansUsingMethodParameters2;

public class Vehicle {
    private String name;
    public Vehicle(){
        System.out.println("This vehicle is " + getName());
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
