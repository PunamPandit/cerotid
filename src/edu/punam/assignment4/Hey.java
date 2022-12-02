package edu.punam.assignment4;

public class Hey extends Hi{
	
	public String name = "punam";

	public static void main (String[] args) {
		 Hey he = new Hey();
		 System.out.println(he.name);
		 System.out.println(he.color);
		 he.hey();
	 }

}
