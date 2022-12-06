package it.develhope;

public class Car extends Vehicle{
    //Variables
    int numberOfDoors;
    int carPrice;

    //methods
    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("Porte: " + numberOfDoors);
    }

    @Override
    public void doVehicleSound(){
        System.out.println("Brumm brumm!\n");
    }

    //Constructor
    Car(int wheels, int doors,int price){
        numberOfDoors = doors;
        carPrice = price;
        numberOfWheels = wheels;
        type = "car";
    }

}
