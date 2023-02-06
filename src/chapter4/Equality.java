package chapter4;

public class Equality {

    public static void main(String... args) {
        var a = new String("a");
        var b = new String("a");

        System.out.println(a.equals(b)); //true
        System.out.println(a==b); // false

        var builder_a = new StringBuilder("a");
        var builder_b = new StringBuilder("a");

        System.out.println("builder equals: " + (builder_a).equals(builder_b)); //false (true only if passed the same object) compare objects
        System.out.println("builder ==: " + ((builder_a) == (builder_b))); // false

        System.out.println("builder to string equals: " + (builder_a.toString()).equals(builder_b.toString())); // true
        System.out.println("builder to string ==: " + (builder_a.toString()) == (builder_b.toString())); // false
    }


}
