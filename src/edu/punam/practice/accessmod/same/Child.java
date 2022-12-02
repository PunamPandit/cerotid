package edu.punam.practice.accessmod.same;

public class Child extends Parent{
    public static void main(String[] args) {
        Child child= new Child();
        child.defaultCallMe();
        child.protectedCallMe();
        child.publicCallMe();
    }
}
