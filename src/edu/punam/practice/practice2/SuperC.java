package edu.punam.practice.practice2;

public class SuperC extends SuperK {

    public SuperC(String name, int age) {
        super(name, age);
        System.out.println("I'm a constructor from child");
    }

    public void hiChild(){
        System.out.println(super.name);
        System.out.println(super.age);
        super.hi();
    }

    public static void main(String[] args){
       SuperC superC = new SuperC("Me", 1);
       superC.hiChild();
    }
}
