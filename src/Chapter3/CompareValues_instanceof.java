package Chapter3;
// Java program to demonstrate working of instanceof Keyword

// Class 1
// Parent class
class Parent {}

// Class 2
// Child class
class Child extends Parent {}

// Class 3
// Main class
public class CompareValues_instanceof {

    // Main driver method
    public static void main(String[] args)
    {

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
}