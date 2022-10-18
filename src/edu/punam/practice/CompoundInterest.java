package edu.punam.practice;

public class CompoundInterest {
    public static void main (String[]args){
        int p = 35;
        int r = 5;
        int n = 7;
        int compoundInterest = p * ((1 + r / 100) ^ n);

        System.out.println("Compound Interest ="+ compoundInterest);
    }
}
