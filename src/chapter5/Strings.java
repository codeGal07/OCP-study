package chapter5;

public class Strings {
    public static void main(String[] args) {

        // if either operand is a String, + means concatenation
        // the expression is evaluated left to right
        System.out.println("1" + 2); // 12
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println("c" + 1 + 2); // c12

        //? indexOf()
        String string = "animals";
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4 - Java shouldn’t even look at the characters until it gets to index 4
        System.out.println(string.indexOf("al", 5)); // -1 no match is found

        //? substring()
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(3, 4));  // m
        System.out.println(string.substring(1, 7)); // nimals
        System.out.println(string.substring(3, 3)); // empty string
//        System.out.println(string.substring(3, 2)); // throws exception
//        System.out.println(string.substring(3, 8)); // throws exception

        //? toUpperCase() toLowerCarse()
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

        //? equals() equalsIgnoreCase()
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        //? startsWith() endsWith()
        // case sensitive
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        System.out.println("abc".strip()); // abc
        System.out.println("\t a b c\n".strip()); // a b c
        String text = " abc\t ";
        System.out.println(text.trim().length()); // 3
        System.out.println(text.strip().length()); // 3
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing().length());// 4



    }
}
