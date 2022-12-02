package edu.punam.practice.example;

public class ClassAndMethod {
    public String name;
    public int age;

    public ClassAndMethod() {
    }

    public ClassAndMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printNameAgeAndGender(String name, int age, char gender) {
        System.out.println("Name: " + name + " age: " + age + " gender: " + gender);
    }

    public void printNameAgeAndGender(String name, int age) {
        System.out.println("Name: " + name + " age: " + age);
    }

    public static void main(String[] args) {
        ClassAndMethod classAndMethod= new ClassAndMethod();
        classAndMethod.printNameAgeAndGender("Punam", 21, 'F');

        ClassAndMethod classAndMethod100 = new ClassAndMethod("Punam21", 22);
    }
}
