package edu.punam.practice.inheritence.methodoverride;

public class CarObject {
    public static void main(String[] args) {
        Car firstGenCar = new FirstGenCar();
        System.out.println(firstGenCar.getEngineType());

        Car secondGenCar = new SecondGenCar();
        System.out.println(secondGenCar.getEngineType());
    }
}
