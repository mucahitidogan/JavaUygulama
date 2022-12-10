package com.bilgeadam.week6.lesson01.engineHW;

import com.bilgeadam.week6.lesson01.engineHW.motorwatervegicles.MotorWaterVehicles;

public class Sail extends MotorWaterVehicles {

    private String type;

    public Sail(String brand, int year, Engine engine, int numberOfEngine, double width, double height, String registry, String hullMaterial, int numberOfCabin, String type) {
        super(brand, year, engine, numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "brand = " + super.getBrand() +
                        "\nregistry = " + super.getRegistry()  +
                        "\nyear = " + super.getYear() +
                        "\nnumberOfEngine = " + super.getNumberOfEngine() +
                        "\nnumberOfCabin = " + super.getNumberOfCabin()  +
                        "\nhullMaterial = " + super.getHullMaterial()  +
                        "\nwidth = " + super.getWidth()  +
                        "\nheight = " + super.getHeight()  +
                        "\ntype = " + type  +
                        "\n" + super.getEngine();
    }
}
