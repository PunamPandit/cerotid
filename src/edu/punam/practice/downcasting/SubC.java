package edu.punam.practice.downcasting;

public class SubC extends SuperC {

    public static void main(String[] args) {
        SuperC superC = new SubC(); //up casting
        SubC subC = (SubC) superC; //down casting
        String superCData = subC.getData();
        System.out.println(superCData);
    }
}
