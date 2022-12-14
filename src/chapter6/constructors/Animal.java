package chapter6.constructors;

public class Animal {
    private int age;
    public Animal(int age) {
//        super(); // Refers to constructor in java.lang.Object
        this.age = age;
        System.out.println("in Animal constructor");
    }
}
