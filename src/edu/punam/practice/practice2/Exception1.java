package edu.punam.practice.practice2;

public class Exception1 extends Object{
	public static void main (String[] args) {
		String name = "punam";
		
		int w= 27;
		int y = 0;
		
		try {
			
		int result = w/y ;
		} 
		catch(Exception e)  {
			
			System.out.println(e.getMessage());
			
		}
}
}