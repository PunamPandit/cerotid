package edu.punam.practice.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 100;
        System.out.println(intArray[0]);

        ArrayList<Integer> arrayList = new ArrayList(); //UnSynchronized
        arrayList.add(101);
        System.out.println(arrayList.get(0));

        Vector<Integer> vector = new Vector(); //Synchronized
        vector.add(102);
        System.out.println(vector.get(0));

        LinkedList linkedList= new LinkedList();
        linkedList.add(103);
        System.out.println(linkedList.get(0));
    }
}
