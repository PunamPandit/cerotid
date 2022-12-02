package edu.punam.assignment4;

public class Hi extends Hello{

	public String color = "green";

	public static void main (String[] args) {
		Hi hi = new Hi ();
		System.out.println(hi.color);
		hi.hey();	
	}
}
