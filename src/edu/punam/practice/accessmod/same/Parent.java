package edu.punam.practice.accessmod.same;

public class Parent {
    void defaultCallMe(){
        System.out.println("I'm default");
    }

    public void publicCallMe() {
        System.out.println("I'm public");
    }

    private void privateCallMe() {
        System.out.println("I'm public");
    }

    protected void protectedCallMe() {
        System.out.println("I'm public");
    }

    public static void main(String[] args) {
        Parent parent= new Parent();
        parent.publicCallMe();
        parent.defaultCallMe();
        parent.protectedCallMe();
        parent.privateCallMe();
    }
}
