package com.bilgeadam.week6.lesson01.engineHW;

import com.bilgeadam.week6.lesson01.engineHW.motorwatervegicles.MotorWaterVehicles;

public class Yacht extends MotorWaterVehicles {

    private int numberOfBeds;
    private String engineBrand;

    public Yacht(String brand, int year, Engine engine, int numberOfEngine, double width, double height, String registry, String hullMaterial, int numberOfCabin, int numberOfBeds, String engineBrand) {
        super(brand, year, engine, numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.numberOfBeds = numberOfBeds;
        this.engineBrand = engineBrand;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    @Override
    public String toString() {
        return
                "brand = " + super.getBrand() +
                        "\nregistry = " + super.getRegistry()  +
                        "\nyear = " + super.getYear() +
                        "\nengineBrand = " + engineBrand +
                        "\nnumberOfEngine = " + super.getNumberOfEngine() +
                        "\nnumberOfCabin = " + super.getNumberOfCabin()  +
                        "\nnumberOfBeds = " + numberOfBeds +
                        "\nhullMaterial = " + super.getHullMaterial()  +
                        "\nwidth = " + super.getWidth()  +
                        "\nheight = " + super.getHeight()  +
                        "\n" + super.getEngine();

    }
}
