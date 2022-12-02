package edu.punam.practice.interfacepckg;

public class SecondGenCar implements FirstGenCar {

	public void drive() {
		System.out.println("we can drive car");
	}

	public void gas() {
		System.out.println("car run by using gas");
	}

	public static void main (String[] args) {
		FirstGenCar s= new SecondGenCar();
		s.drive();
		s.gas();
	}
}
