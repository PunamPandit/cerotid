package edu.punam.practice.Assignment5;

import com.sun.tools.javac.parser.Tokens;
import jdk.nashorn.internal.parser.Token;

public class StringAFive {
    public static void main(String[] args) {
        String words = "i am doing assignment";
        String[] wordsTokens =words.split(" ");
        System.out.println("Number of words in a sentence is "+ wordsTokens.length);
    }
}
