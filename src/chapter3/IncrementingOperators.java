package chapter3;

public class IncrementingOperators {
    public static void main (String []args) {
        int incrementAfter = 5;
        incrementAfter = incrementAfter++;
        System.out.println("incrementAfter: " + incrementAfter); // 5

        int incrementBefore = 5;
        incrementBefore = ++incrementBefore;
        System.out.println("incrementBefore: " + incrementBefore); // 6
    }
}
