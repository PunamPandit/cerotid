package edu.punam.practice.practice2;

import java.util.Scanner;

public class ForLoop2 {
public static void main (String[] args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("please enter any name :");
	String name = scanner.nextLine();
	for (int i=0;i<=25;i++) {
		if (name=="Punam") {
			System.out.println(i);
		}
	}
}
}
