package edu.punam.practice.constructers;

public class Person {
    public String name ="Punam" ;
    public int age = 22 ;

    Person(){
    }

    Person(String name ,int age) {
        this.name = name ;
        this.age = age ;
    }

    Person( String name ){
        this.name = name ;
    }

    Person( int age){
        this.age = age ;
    }

    Person ( int age ,String name ){
        this.age = age ;
        this.name = name ;
    }

    public void getName(){
        String name = "Sanjeev";
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main (String[] args ){
        Person person1 = new Person();
        person1.getName();
        Person person2 = new Person(22,"priya");
        person2.getName();

    }

}
