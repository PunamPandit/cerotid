package edu.punam.assignment3;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 3 digit number: ");
        int num = scanner.nextInt(), sum = 0, mul = 1;
        while (num % 10 != 0) {
            int rem = num % 10;
            sum = sum + rem;
            mul = mul * rem;
            num = num / 10;
        }
        System.out.println("Sum is:" + sum);
        System.out.println("Multiplication is:" + mul);
    }
}
