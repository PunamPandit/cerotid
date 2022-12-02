package edu.punam.assignment3;

public class PrimeNumber {
    public boolean isPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void nthPrimeNum(int num) {
        int i = 3, counter = 0;
        while (counter != num) {
            if (isPrimeNumber(i)) {
                counter++;
                if (counter == num) {
                    System.out.println(num + "th Prime number is: " + i);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
    }

    public void allPrimeNumBetween(int num1, int num2) {
        System.out.print("all prime numbers between "+num1+" and "+num2+" are: ");
        for (int i = num1; i<= num2; i++){
            if (isPrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();

        if (primeNumber.isPrimeNumber(13)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        primeNumber.nthPrimeNum(1);

        primeNumber.allPrimeNumBetween(3, 10);
    }
}
