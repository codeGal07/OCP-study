package chapter3;


import java.io.File;

public class CompareValues {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");
        System.out.println(s1 == s2); // true (because both refer to same instance)
        System.out.println(s1 == s3); // false(because s3 refers to instance created in nonpool)

        // Operator == compares reference or memory location of objects in a heap, whether they point to the same location or not.

        //Whenever we create an object using the operator new, it will create a new memory location for that object.
        // So we use the == operator to check memory location or address of two objects are the same or not.

        // .equals() evaluates to the comparison of values in the objects.

        // If the numeric values are of
        // different data types, the values are automatically promoted. For example, 5 == 5.00
        // returns true since the left side is promoted to a double.
        System.out.println(5 == 5.0); // true


        //Even though all of the variables point to the same file information, only two references,
        //tuesday and wednesday , are equal in terms of == since they point to the same object.
        System.out.println("------------");
        File monday = new File("schedule.txt"); // new instance
        File tuesday = new File("schedule.txt"); // separate and distinct object because the "new" keyword is used
        File wednesday = tuesday;
        System.out.println(monday == tuesday); // false
        System.out.println(tuesday == wednesday); // true

        // comparing null is true! even tho in some languages is false
        System.out.println(null == null); // true


        // ASCII code - same with double (97.0) or int (97) numbers
        System.out.println('a' == 97.0); // true


    }
}