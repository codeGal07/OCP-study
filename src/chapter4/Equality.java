package chapter4;

public class Equality {

    public static void main(String... args) {
        var a = new String("a");
        var b = new String("a");

        System.out.println(a.equals(b)); //true
        System.out.println(a==b); // false

        var builder_a = new StringBuilder("a");
        var builder_b = new StringBuilder("a");
        /*
        We can use the equals() method for comparing two strings in Java since the String class overrides the equals() method
        of the Object class, while StringBuilder doesn't override the equals() method of the Object class and hence equals()
        method cannot be used to compare two StringBuilder objects
         */
        System.out.println("builder equals: " + (builder_a).equals(builder_b)); //false (true only if passed the same object) compare objects
        System.out.println("builder ==: " + ((builder_a) == (builder_b))); // false (true only if passed the same object)

        System.out.println("builder to string equals: " + (builder_a.toString()).equals(builder_b.toString())); // true
        System.out.println("builder to string ==: " + (builder_a.toString()) == (builder_b.toString())); // false

        System.out.println("------------------");

        //String pool
        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y); // true

        var xx = "Hello World";
        var yy = "         Hello World".trim();
        System.out.println(xx == yy); // false

    }


}
