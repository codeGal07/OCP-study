package chapter6.constructors;

import chapter6.callingSuperReference2.Beetle;

public class Zebra extends Animal{
    public Zebra(int age) {
        super(age); // Refers to constructor in Animal
        System.out.println("in Zebra with age constructor");
    }
    public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
        System.out.println("in Zebra constructor");
    }

    public static void main(String[] n) {
        new Zebra();

        // in Animal constructor
        // in Zebra with age constructor
        // in Zebra constructor
    }
}
