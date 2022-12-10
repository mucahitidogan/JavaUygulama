package com.bilgeadam.week6.lesson01.engineHW;

public class Engine  {

    private  double enginePower;
    private  double engineVolume;
    private  FuelType fuelType;

    public Engine(double enginePower, double engineVolume, FuelType fuelType) {
        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return  "fuelType = " + fuelType +
                "\nenginePower = " + enginePower +
                "\nengineVolume = " + engineVolume;
    }
}
