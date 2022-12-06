package it.develhope;

public class Main {
    public static void main(String[] args) {
        //Creo oggetti
        Car car1 = new Car(4, 4, 23000);
        Boat boat1 = new Boat (22.5, 5000);

        //Macchina
        car1.showVehicleDetails();
        car1.doVehicleSound();

        //Barca
        boat1.showVehicleDetails();
        boat1.doVehicleSound();
        String info = boat1.getBoatWeightAndSpeed();
        System.out.println(info);
    }
}