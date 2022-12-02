package edu.punam.practice.classandobject;

public class CarClass {
    public String color = "Red";
    public String brand = "Toyota";
    public int yearOfMake = 2022;

    CarClass() {
    }

    CarClass(String color) {
        this.color = color;
    }

    CarClass(String color, String brand, int yearOfMake) {
        this.color = color;
        this.brand = brand;
        this.yearOfMake = yearOfMake;
    }

    public void callMe() {
        System.out.println("I'm here");
    }

    public static void main(String[] args) {
        CarClass toyota = new CarClass();
        toyota.color = "White";
        toyota.brand = "Rav 4";
        toyota.yearOfMake = 2022;

        System.out.println(toyota.color);
        System.out.println(toyota.brand);
        System.out.println(toyota.yearOfMake);

        CarClass tesla = new CarClass("Black", "model s", 2021);
        System.out.println(tesla.color);
    }
}
