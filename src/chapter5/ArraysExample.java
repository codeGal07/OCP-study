package chapter5;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        System.out.println(Arrays.toString(bugs)); // since java 5 [cricket, beetle, ladybug]

        String names[]; // points to null, array was never instantiated

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        // doesn’t compile because a String[] only allows String objects and
        // StringBuilder is not a String
//        againStrings[0] = new StringBuilder(); // DOES NOT COMPILE

        // From the point of view of the compiler, this is just fine
        // A StringBuilder object can clearly go in an Object[]. The problem is that we don’t
        // actually have an Object[]. We have a String[] referred to from an Object[] variable. At
        // runtime, the code throws an ArrayStoreException.
        objects[0] = new StringBuilder(); // runtime exception


        String[] birds = new String[6]; // all six elements of the array are null
        System.out.println(birds.length); // 6


    }


}
