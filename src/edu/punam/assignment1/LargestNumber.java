package edu.punam.assignment1;

public class LargestNumber {
    public static void main(String[] args) {
        int x = 45, y = 35, z = 44;

        if (x > y && x > z) {
            System.out.println("x is the largest number");
        }
        else if (y > x && y > z) {
            System.out.println("y is largest number");
        } else {
            System.out.println("z is largest number");
        }

    }
}
