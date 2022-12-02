package edu.punam.practice.overloading;

public class Overloading {
    public int getArea(int length){
        return (length*length);
    }

    public int getArea(int length, int breadth ){
         return  (length*breadth);
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        int a = overloading.getArea(7);
        System.out.println("area of a square is " + a);

        int b = overloading.getArea(2,5);
        System.out.println("area of rectangle is "+ b);

    }
}
