package com.company;

public class TestRunner {

    public void Run() {

        //Vehicle v1 = new Vehicle(); abstract cannot be instantiated
        Car c1 = new Car();

        Car c2 = new Car("Nissan", "Navara");

        MessageCentre.DebugMessage(c2.toString());

        Bycicle b1 = new Bycicle();

        System.out.println(b1.toString());
    }
}
