package edu.punam.assignment4;

public class Institute extends Student {
	
	public void biodata () {
		System.out.println("every students and teacher needs biodata to enter in an institute");
	}

	public static void main (String[] args) {
		Institute institute = new Institute ();
		institute.biodata();
		institute.experieance();
		institute.branch();
	}
}
