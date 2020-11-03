package com.company;

public class Car extends Vehicle {

    public Car() {

        MessageCentre.DebugMessage("Creating a Car");
    }

    public Car(String manufacturer, String modelName) {

        MessageCentre.DebugMessage("Creating a car with manufacturer and modelname");
        setManufacturer(manufacturer);
        setModelName(modelName);
    }


    @Override
    public String toString() {

        return String.format("ToString() => C2 Manufacturer: %s, model: %s", getManufacturer(), getModelName());
    }
}
