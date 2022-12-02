package edu.punam.practice.practice2;

public class StringExample2 {
    public static void main(String[] args) {
        String str= "Punam";
        String str2="manup";

        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0,3));

        String[] strings = str.split("n");
        for (String s: strings) {
            System.out.println(s);
        }

        if (str.contains("a")){
            System.out.println(str + " contains a");
        }else {
            System.out.println(str + " does not contains a");
        }

        if (str.equals(str2)){
            System.out.println(str + " and "+ str2 +" are equal");
        }else{
            System.out.println(str + " and "+ str2 +" are not equal");
        }
    }
}
