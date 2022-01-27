package com.sparta.vehicles;

public class Vehicle {
    final String make;
    final String model;
    final String licencePlate;
    final String engineSize;
    final String colour;
    final String type;
    final int fuelLevel;
    final boolean isMOTed;

    /**
     *
     * @param make holds the make of the car
     * @param model holds the model of the car
     * @param licencePlate holds the license plate of the car
     * @param engineSize holds the engine size of the car
     * @param colour holds the colour of the car
     * @param type holds the type of the car
     * @param fuelLevel holds the current fuel level of the car
     * @param isMOTed holds the boolean value whether the car has passed its recent MOT
     */

    public Vehicle(String make, String model, String licencePlate, String engineSize, String colour, String type, int fuelLevel, boolean isMOTed) {
        this.make = make;
        this.model = model;
        this.licencePlate = licencePlate;
        this.engineSize = engineSize;
        this.colour = colour;
        this.type = type;
        this.fuelLevel = fuelLevel;
        this.isMOTed = isMOTed;
    }

    public String isMOTValid() {
        String isMOTValid;
     if (isMOTed){
         isMOTValid = "valid";
     }
     else{
         isMOTValid = "invalid";
     }
     return isMOTValid;
    }

    /**
     *
     * @return Returns a concatenated String with the information about the car
     */

    public String toString() {
        String carMOT = isMOTValid();

        return "The car with make and model " + make + " " + model + " has an engine size of " + engineSize +
                " and has a fuel level of " + fuelLevel + "%. The car is MOT " + carMOT +
                ". The colour of the car is " + colour + " and is a " + type + " type of car." +
                " We have a car with the licence plate: " + licencePlate;
    }


}
