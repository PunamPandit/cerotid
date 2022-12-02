package edu.punam.practice.abstraction;

public class SubC extends SuperC {

    public String getData() {
        return "I'm a data";
    }

    public static void main(String[] args) {
        SuperC superC = new SubC();
        superC.getData();
    }
}
