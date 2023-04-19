package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/**
 * Move all negative numbers to beginning and positive to end with constant
 * extra space
 *
 * An array contains both positive and negative numbers in random order.
 * Rearrange the array elements so that all negative numbers appear before all
 * positive numbers.
 *
 * Examples : * Input: -12, 11, -13, -5, 6, -7, 5, -3, -6 Output: -12 -13 -5 -7
 * -3 -6 11 6 5
 *
 * In this approach, we use two pointers - i and j. We start with i pointing to
 * the beginning of the array and j pointing to the end of the array. We swap
 * the negative number at arr[i] with the positive number at arr[j] if arr[i] is
 * negative and arr[j] is positive. We move i pointer to the right and j pointer
 * to the left until i becomes greater than j, ensuring that all negative
 * numbers are moved to the beginning and positive numbers to the end of the
 * array. The time complexity of this approach is O(n), where n is the number of
 * elements in the array, and the space complexity is O(1) as we are using a
 * constant amount of extra space for swapping the numbers.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class MoveNegativeToBeginning {

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (arr[i] >= 0 && arr[j] < 0) {
                // Swap negative number at i with positive number at j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] < 0) {
                // Move i pointer to the right
                i++;
            } else if (arr[j] >= 0) {
                // Move j pointer to the left
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        rearrangeArray(arr);

        System.out.println("Array after rearrangement: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
