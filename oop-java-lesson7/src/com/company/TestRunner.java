package com.company;

public class TestRunner {

    public void Run() {

        RunObjects();
        RunCarPark();

    }

    public void RunCarPark() {
        CarPark carpark = new CarPark();
        Car c1 = new Car();
        Car c2 = new Car("Nissan","Navara");
        Car c3 = new Car("Ford", "Escort");

        carpark.ParkCar(c1);
        carpark.ParkCar(c2);
        carpark.ParkCar(c3);

        MessageCentre.DebugMessage(carpark.toString());


    }


    public void RunObjects() {

        // Vehicle v1 = new Vehicle(); // abstract, cannot be instantiated


        Car c1 = new Car();

        Car c2 = new Car("Nissan", "Navara");

        MessageCentre.DebugMessage(c2.toString());

        Bycicle b1 = new Bycicle();

        System.out.println(b1.toString());

    }
}
