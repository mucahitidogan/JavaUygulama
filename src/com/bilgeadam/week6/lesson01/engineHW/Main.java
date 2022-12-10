package com.bilgeadam.week6.lesson01.engineHW;

public class Main {

    public static void main(String[] args) {

        Engine engine1 = new Engine(500,450,FuelType.Gasoline);
        Engine engine2 = new Engine(950,850,FuelType.Diesel);
        Engine engine3 = new Engine(1080,1100,FuelType.Diesel);
        Car car1 = new Car("Mercedes",2020,engine1,"33 K 33",4,5);
        System.out.println("---  CAR1 Properties  --------");
        System.out.println(car1);
        engine1.setEnginePower(800);
        System.out.println("---  CAR1 Updated Properties  --------");
        System.out.println(car1);
        Sail sail1 = new Sail("Dufour",2018,engine2,2,8.70, 10.31, "Turkey","Fiberglass ",2,"sailboat");
        System.out.println("---  SAIL1 Properties  --------");
        System.out.println(sail1);
        sail1.setHullMaterial("Fiberglass");
        System.out.println("---  SAIL1 Updated Properties  --------");
        System.out.println(sail1);
        Yacht yacht1 = new Yacht("Admiral",2015,engine3,5,8.6,16.7,"Portugal","wood",3,5,"Cummins");
        System.out.println("---  YACHT1 Properties  --------");
        System.out.println(yacht1);


    }

}
