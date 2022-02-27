package chapter5;

import java.util.Arrays;

public class SearchingArray {
    public static void main(String[]args) {

        // !this only works on sorted arrays
        // if element is not in the array, result is (negativen index value where it should be -1)
        int[] numbers_sorted = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers_sorted, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers_sorted, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers_sorted, 1)); // -1 (can't be 0, so it is -1)
        System.out.println(Arrays.binarySearch(numbers_sorted, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers_sorted, 9)); // -5 (should be in index 4, we negate and substract, getting -4-1 = -5)

        int[] numbers_not_sorted = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbers_not_sorted, 2)); // unpredictable output
        System.out.println(Arrays.binarySearch(numbers_not_sorted, 3)); // unpredictable output

    }
}
