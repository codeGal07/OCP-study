package chapter5;

import java.util.Arrays;

public class CompareMismatch {

    public static void main(String [] args) {

        //A negative number means the first array is smaller than the second.
        //A zero means the arrays are equal.
        //A positive number means the first array is larger than the second.

        System.out.println(Arrays.compare(new int[] {1}, new int[] {2})); //-1
        System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1,3})); //-1
        System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1})); // 1
        System.out.println(Arrays.compare(new int[] {1}, new int[] {1,2})); // -1!!!!
        System.out.println(Arrays.compare(new int[] {1,2,3}, new int[] {1,2,3})); // 0

        // when completely the same 0
        // when different -1
        // when second is "substring" from the first 1

        // !When comparing two arrays, they must be the same array type.
//      System.out.println(Arrays.compare(new int[] {1}, new String[] {"a"})); // DOES NOT COMPILE

//------------------------------------------------------------------------------------

        // *If the arrays are equal, mismatch() returns -1. Otherwise, it returns the first index where they differ.
        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {2})); // 0
        System.out.println(Arrays.mismatch(new int[] {1,2}, new int[] {1,3})); // 1
        System.out.println(Arrays.mismatch(new int[] {1,2}, new int[] {1})); // 1
        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1,2})); // 1
        System.out.println(Arrays.mismatch(new int[] {1,2,3}, new int[] {1,2,3})); // -1





    }
}
