package edu.punam.practice;

public class CarObject {
    public static void main(String[] args) {
        CarClass bmw = new CarClass();
        bmw.brand = "toyota";
        bmw.color = "Red";
        bmw.yearOfMake = "2022";

        String output = bmw.detail();
        System.out.println(output);
    }
}
