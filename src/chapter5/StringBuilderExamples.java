package chapter5;

import java.lang.String;
import java.util.Locale;

public class StringBuilderExamples {
    public static void main(String args[]) {

        // * is immutable
        String ABC = "ABC";
        ABC.toLowerCase(Locale.ROOT); // nothing happens
        System.out.println(ABC); // ABC

        // * is NOT immutable
        StringBuilder ABC_builder = new StringBuilder("ABC_builder");
        ABC_builder.append("!!!"); // ABC_builder!!!
        System.out.println(ABC_builder); // ABC_builder!!!

        // ! There’s only one StringBuilder object here. We know that
        // ! because new StringBuilder() was called only once.
        // Both variables point to the same object
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a); // abcdefg
        System.out.println("b=" + b); // abcdefg


        StringBuilder sb1 = new StringBuilder(); // sb1 points to empty string ""
        StringBuilder sb2 = new StringBuilder("animal"); // specific value to what sb2 should point to
        StringBuilder sb3 = new StringBuilder(10); // reserve certain capacity (number of slots for characters)

        // ? append()
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true

        // ? insert()
        StringBuilder sb4 = new StringBuilder("animals");
        sb4.insert(7, "-"); // sb = animals
        sb4.insert(0, "-"); // sb = -animals

        // ? delete() and deleteCharAt()
        StringBuilder sb5 = new StringBuilder("abcdef");
        sb5.delete(1, 3); // sb = adef
        sb5.deleteCharAt(5); // throws an exception

//        If you specify a second parameter that is past the end of the StringBuilder,
//        Java will just assume you meant the end. That means this code is legal:
        sb.delete(1, 100); // sb = a

        // ? replace()
        // different from string method replace
        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty"); // pigsty dirty
        builder.replace(3, 100, ""); // pig
    }



}
