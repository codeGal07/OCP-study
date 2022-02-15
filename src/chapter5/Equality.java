package chapter5;

public class Equality {
    public static void main(String[]args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");// points to the same object as one
        two.append("a");
        System.out.println("two:"+ two); // a
        System.out.println("one:"+ one); // a
        System.out.println("three:"+ three); // a
        System.out.println(one == two); // false
        System.out.println(one == three); // true

        //? String pool
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true

        // We don't have two of the same String literal.
        // Although x and z happen to evaluate to the same string,
        // one is computed at runtime. Since it isn't the same at
        //compile-time, a new String object is created.
        String a = "Hello World";
        String b = " Hello World".trim();
        System.out.println(a == b); // false

        String singleString = "hello world";
        String oneLine = "hello " + "world";
        String concat = " hello";
        concat += "world";
        System.out.println(singleString == oneLine);
        System.out.println(singleString == concat);

        //“No, JVM, I really don’t want you to use the string pool.
        // Please create a new object for me
        // even though it is less efficient.”
        String k = "Hello World";
        String j = new String("Hello World");
        System.out.println(k == j); // false

        //  The intern() method
        //will use an object in the string pool if one is present. If the literal is not yet in the string
        //pool, Java will add it at this time.
        String name = "Hello World";
        String name2 = new String("Hello World").intern();
        System.out.println(name == name2); // true

        String first = "rat" + 1; // compile-time
        String second = "r" + "a" + "t" + "1"; // compile-time
        String third = "r" + "a" + "t" + new String("1"); // string constructor (not compile-time)
        System.out.println(first == second); // true because both are compile-time (are is string pool)
        System.out.println(first == second.intern()); // true
        System.out.println(first == third); // false
        System.out.println(first == third.intern()); // java notices that first point to the same string (because of intern())
    }
}
