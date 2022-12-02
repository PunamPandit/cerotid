package edu.punam.assignment3;

import java.util.Scanner;

public class FToCAndCToF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the temperature in farenhite :");
        int f = scanner.nextInt();
        System.out.print("Please enter the temperature in Celcius :");
        int c = scanner.nextInt();

        float cel = (f - 32) * 5 / 9;
        System.out.println(+f+"into Celcius is  "+cel);

        float fer = (c * 9 / 5 + 32);
        System.out.println( +c+ " into ferhenheight is  "+fer);
    }
}
