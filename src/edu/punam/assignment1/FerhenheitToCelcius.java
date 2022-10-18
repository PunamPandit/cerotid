package edu.punam.assignment1;

public class FerhenheitToCelcius {
    public static void main (String[] args){
        // To convert fohrenheit to celsius
        int f= 20, c= 23;
        double celsius= (f-32)* 5/9 ;
        double ferhenheit= (c*9/5)+32;
        System.out.println(celsius+" Celsius to Ferhenheit is "+ferhenheit);

    }
}
