package com.bilgeadam.week6.lesson01.engineHW;

import com.bilgeadam.week6.lesson01.engineHW.motorlandvehicles.MotorLandVehicle;

public class Car extends MotorLandVehicle {

    private int numberOfDoors = 4;


    public Car(String brand, int year, Engine engine, String licensePlate, int numberOfWheels, int numberOfDoors) {
        super(brand, year, engine, licensePlate, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return
                "brand = " + super.getBrand() +
                        "\nyear = " + super.getYear() +
                        "\nlicensePlate = " + super.getLicensePlate()  +
                        "\nnumberOfDoors = " + numberOfDoors  +
                        "\nnumberOfWheels = " + super.getNumberOfWheels() +
                        "\n" + super.getEngine();
    }

}
