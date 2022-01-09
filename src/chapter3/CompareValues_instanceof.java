package chapter3;
// Java program to demonstrate working of instanceof Keyword

// Class 1
// Parent class
class Parent {
}

// Class 2
// Child class
class Child extends Parent {
}

// Class 3
// Main class
public class CompareValues_instanceof {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of child class
        Child myChild = new Child();

        // First case
        if (myChild instanceof Child)
            System.out.println("myChild is instance of Child");
        else
            System.out.println(
                    "myChild is NOT instance of Child");

        // instanceof returning true for Parent class also
        if (myChild instanceof Parent)
            System.out.println(
                    "myChild is instance of Parent");
        else
            System.out.println(
                    "myChild is NOT instance of Parent");

        // instanceof returns true for all ancestors

        // Note : Object is ancestor of all classes in Java
        if (myChild instanceof Object)
            System.out.println(
                    "myChild is instance of Object");
        else
            System.out.println(
                    "myChild is NOT instance of Object");
    }

    // Example when to use instanceof
    // it is common to use casting and instanceof together when working with objects that can be various different types
    public static void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.print((Integer) time + " O'clock");
        else
            System.out.print(time);

        // Number cannot possibly hold a String value
//        if(time instanceof String) // DOES NOT COMPILE!!!!!!!

        // Calling instanceof on the null literal or a null reference always returns false
        System.out.print(null instanceof Object); // false

          // Does not compile, since null is used on the right side of the instanceof operator
//        System.out.print(null instanceof null); // DOES NOT COMPILE
    }
}