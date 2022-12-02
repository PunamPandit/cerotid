package edu.punam.practice.practice2;

public class StaticBlock {
	public static String myname = "punam";
	public static String dob = "feb 04";
	public static String anniversaryDate = "nov 21";
	public static int myNum = 1;

	public static void addition(int num) {
		myNum = num+1;
	}

	public static void main(String[] args) {
		myNum = myNum +1;

		StaticBlock.addition(myNum);
		StaticBlock.addition(myNum);
		StaticBlock.addition(myNum);
		StaticBlock.addition(myNum);
		StaticBlock.addition(myNum);

		System.out.println(myNum);
	}

	static{
		System.out.println(StaticBlock.myname);
		System.out.println(StaticBlock.anniversaryDate);
		System.out.println(StaticBlock.dob);

		myNum = myNum + 1;
	}
}
