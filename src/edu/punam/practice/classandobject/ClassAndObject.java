package edu.punam.practice.classandobject;
public class ClassAndObject {
	public String myname = "punam";
	public String dob = "feb 04";
	public String anniversaryDate = "nov 21";

	public ClassAndObject () {

	}

	public ClassAndObject(String myname,String dob,String anniversaryDate) {
		this.anniversaryDate = anniversaryDate ;
		this.dob = dob ;
		this.myname = myname ;

	}

	public static void main(String[] args) {
		ClassAndObject poo = new ClassAndObject();
		String name = poo.myname;
		String annDate= poo.anniversaryDate;
		String dob = poo.dob;

		System.out.println(name);
		System.out.println(annDate);
		System.out.println(dob);
}

}
