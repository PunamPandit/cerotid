package edu.punam.assignment4;

public class Sita extends Ram{
	public String name = "Hanuman";
	
	public void how () {
		System.out.println("hii");
	}
	
	public static void main (String[]args) {
		Sita s =  new Sita ();
		s.how();
		System.out.println(s.name);
		s.mike();
	}
}
