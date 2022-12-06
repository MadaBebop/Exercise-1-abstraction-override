package it.develhope;

public class Boat extends Vehicle{
    //Variabili
    double maxKnotsSpeed;
    int boatKilosWeight;

    @Override
    public void doVehicleSound(){
        System.out.println("Wruummm brumm!\n");
    }

    //Constructor
    Boat(double maxSpeed, int weight){
        maxKnotsSpeed = maxSpeed;
        boatKilosWeight = weight;
        type = "boat";
    }

    //Method
    public String getBoatWeightAndSpeed(){
         return "Velocity: " + maxKnotsSpeed + "\tweight: " + boatKilosWeight + "\n";
    }
}
