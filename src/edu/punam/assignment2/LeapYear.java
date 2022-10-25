package edu.punam.assignment2;

public class LeapYear {
    public static void main(String[] args) {
        double year = 2022;
        boolean isLeapYear = year % 4 != 0;
        String leapYear = isLeapYear ? "this is not a leap year" : "this is a leap year ";
        System.out.println(leapYear);
    }
}
