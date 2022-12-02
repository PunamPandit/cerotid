package edu.punam.practice.accessmod.same;

public class SamePckgs {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.publicCallMe();
        parent.defaultCallMe();
        parent.protectedCallMe();

    }
}
