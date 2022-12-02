package edu.punam.assignment4;

public class ClassA extends ClassB{
	public String name = "rita";
	public int age = 23;
	
	
	public static void main (String[]args) {
		ClassA classA = new ClassA();
		System.out.println(classA.name);
		System.out.println(classA.age);
		classA.hello();
	}
}