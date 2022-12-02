package edu.punam.practice.inheritence;

public class Fruits extends Apple {
	public String name1 = "orange";

	public static void main(String[]args){
		Fruits ap = new Fruits ();

		String fruit = ap.name1 ;
		System.out.println(fruit);

		System.out.println(ap.name);
		System.out.println(ap.iloveapple());
	}
}
