package edu.punam.assignment2;

import java.util.Scanner;

public class IfElseTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        int num = scanner.nextInt();
        int rem = num % 2;
        if (rem != 0) {
            for (int i = 1; i <= 10; i++) {
                int mul = 5 * i;
                System.out.println("5*" + i + "="+ mul);
            }
        }
    }
}
