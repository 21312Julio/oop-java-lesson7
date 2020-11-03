package com.company;

import java.util.ArrayList;

public class CarPark {

    private ArrayList<Car> listOfCars = new ArrayList<Car>();


    public CarPark() {
        MessageCentre.DebugMessage("Creating a CarPark");
    }

    public void ParkCar(Car carToPark) {
        listOfCars.add(carToPark);
    }

    public Double CalculateDailyRevenue() {
        Double charge = 5.00;
        Double totalRevenue = 0.0;

        for(Car currentCar:listOfCars) {
            MessageCentre.DebugMessage(String.format("Calculating for %s : %s",currentCar.getManufacturer(), currentCar.getModelName()));
            totalRevenue += charge;

        }

        return totalRevenue;
    }

    @Override
    public String toString() {

        return String.format("The car park has %d cars and daily revenue of %f", listOfCars.size(), CalculateDailyRevenue());
    }
}