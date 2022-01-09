package chapter3;

public class TernaryExpression {
    public static void main(String[] args) {
        // only one of the expressions on the right side will be evaluated at runtime
        int sheep = 1;
        int zzz = 1;
        int sleep = zzz < 10 ? sheep++ : zzz++;
        System.out.print(sheep + "," + zzz); // 2,1

        int stripes = 7;
//        System.out.print() does not care that the expressions are completely different types
        System.out.print((stripes > 5) ? 21 : "Zebra");
//        the compiler does know that "Horse" is of the
//        wrong data type and cannot be assigned to an int; therefore, it will not allow the code to be compiled
//        int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE

      int a = 3;
      int b = 4;
      long d = a+b;
      System.out.println(d);
    }
}
