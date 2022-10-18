package edu.punam.assignment1;

public class Area {
    public static void main (String[]args){
        int r = 5, l= 4 , b =6 , h = 2 ;
        double areaOfCircle = 3.14 * (r ^2);
        int areaOfRectangle = l * b ;
        int areaOfTriangle = ( b * h ) /2 ;
        System.out.println( "Area of circle is "+ areaOfCircle);
        System.out.println( "Area of rectangle is " + areaOfRectangle);
        System.out.println( "Area of triangle is " + areaOfTriangle);
    }
}
