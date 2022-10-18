package edu.punam.assignment1;

import java.util.Scanner;

public class PoundToKG {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Please enter the weight in pounds ");
        int pound = scanner.nextInt();
        double kg = pound/2.2046 ;
        System.out.println(pound+" pounds to kg is " + kg);
    }
}
