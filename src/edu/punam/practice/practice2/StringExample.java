package edu.punam.practice.practice2;

public class StringExample {
    public static void main(String[] args) {
        String stringObject = new String("Punam");
        String stringLiterals = "Punam";
        char[] charArray = new char[5];
        charArray[0] = 'P';
        charArray[1] = 'u';
        charArray[2] = 'n';
        charArray[3] = 'a';
        charArray[4] = 'm';

        System.out.println(stringLiterals);
        System.out.println(stringObject);
        System.out.println(charArray.toString());
        System.out.println(stringLiterals.equals(stringObject));
        System.out.println(stringLiterals.equals(charArray.toString()));
        System.out.println(stringObject.equals(charArray.toString()));
    }
}
