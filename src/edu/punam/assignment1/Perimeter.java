package edu.punam.assignment1;

public class Perimeter {
    public static void main (String[] args){
        int r = 4 , l = 5 , b = 6 , side1 = 8 ,side2 = 3 , side3 =4 ;
        double perimeterOfCircle = 2 * 3.14 * r ;
        int perimeterOfRectangle = 2 * (l+b);
        int perimeterOfTriangle = side1+ side2+ side3 ;
        System.out.println( "Perimeter of circle is " + perimeterOfCircle);
        System.out.println( "Perimeter of Triangle is " + perimeterOfTriangle);
        System.out.println( "Perimeter Of rectangle is " + perimeterOfRectangle);
    }
}
