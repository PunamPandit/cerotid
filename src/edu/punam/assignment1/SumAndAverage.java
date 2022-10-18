package edu.punam.assignment1;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        float firstNumber = scanner.nextInt();

        System.out.print("Please enter second number: ");
        float secondNumber = scanner.nextInt();

        float sum = firstNumber + secondNumber;
        float average = sum / 2;

        System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is " + sum);
        System.out.println("Average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
}
