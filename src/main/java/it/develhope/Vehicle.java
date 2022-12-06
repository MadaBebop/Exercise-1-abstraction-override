package it.develhope;

abstract class Vehicle {
    //variables
    String type;
    int numberOfWheels;

    //Functions
    void showVehicleDetails(){
        System.out.println("Vehicle " + type + " has " + numberOfWheels + " wheels");
    }

    void doVehicleSound(){
       System.out.println("Brummm!");
    }
}
