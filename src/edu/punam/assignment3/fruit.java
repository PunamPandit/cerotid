package edu.punam.assignment3;

public class fruit {
    public int price;
    public int wight;
    public String name;

    fruit() {
    }

    fruit(int priceOrWeight) {

    }

    fruit(String name) {
        this.name = name ;
    }

    fruit(int price, String name) {
        this.price = price ;
        this.name = name ;
    }

    fruit(String name , int price){
        this.name= name ;
        this.price= price ;

    }

    public static void main(String[] args) {
        fruit frr = new fruit(20, "mango");
    }
}






