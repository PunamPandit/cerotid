package edu.punam.Assignment5;

public class WordsInSentence {
    public static void main(String[] args) {
        String words = "i am doing an assignment";
        String[] wordsTokens =words.split(" ");
        System.out.println("Number of words in a sentence is "+ wordsTokens.length);
    }
}
