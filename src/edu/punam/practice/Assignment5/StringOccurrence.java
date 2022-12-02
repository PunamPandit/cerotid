package edu.punam.practice.Assignment5;

import sun.plugin.dom.css.Counter;

public class StringOccurrence {

    public int getOccurance(String string, Character character) {
        char[] charArray = string.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == character) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        StringOccurrence str = new StringOccurrence();
        System.out.println(str.getOccurance("sanjeev", 'e'));
    }
}
