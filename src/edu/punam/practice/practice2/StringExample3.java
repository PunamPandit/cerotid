package edu.punam.practice.practice2;

public class StringExample3 {
	public int getOccurence(String string ,Character character) {
		char[]charArray=string.toCharArray();
		int counter=0;
		for(int i=0;i<charArray.length;i++) {
			if (i==character) {
				counter++;
				
				}
			}
		
		return counter;
	}
	public static void main(String[] args) {
		StringExample3 str = new StringExample3 () ;
		System.out.println(str.getOccurence("Sanjeev",'e'));
		
	}

}
