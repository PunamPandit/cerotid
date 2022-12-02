package edu.punam.Assignment5;

public class Palindrome {
    public static void main(String[] args) {
        String name = "dad";
        StringBuilder str = new StringBuilder(name);
        String name2=str.reverse().toString();
        if (name.equals(name2)){
            System.out.println("these Two String are palindrome");
        }else {
            System.out.println("they are not palindrome");
        }


    }
}
