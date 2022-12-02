package edu.punam.assignment4;

public class Student extends Teacher{
	
	public void branch () {
		System.out.println("hi ...");	
	}
	
	public void result () {
		System.out.print("hardworking students can get good result");
	}
	
	public static  void main (String[]args) {
		Student student = new Student ();
		student.experieance();
		student.qualification();
		student.branch();
	}
}