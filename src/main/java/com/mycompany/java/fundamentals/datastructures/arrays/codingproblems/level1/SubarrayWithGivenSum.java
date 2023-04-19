package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/**
 * Find Subarray with given sum | Set 1 (Non-negative Numbers)
 *
 * Given an array arr[] of non-negative integers and an integer sum, find a
 * subarray that adds to a given sum.
 *
 * Note: There may be more than one subarray with sum as the given sum, print
 * first such subarray. * Examples: * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum =
 * 33 Output: Sum found between indexes 2 and 4 Explanation: Sum of elements
 * between indices 2 and 4 is 20 + 3 + 10 = 33
 *
 * Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7 Output: Sum found between
 * indexes 1 and 4 Explanation: Sum of elements between indices 1 and 4 is 4 + 0
 * + 0 + 3 = 7
 *
 * Input: arr[] = {1, 4}, sum = 0 Output: No subarray found Explanation: There
 * is no subarray with 0 sum.
 *
 * In this approach, we use two pointers - start and i. We initialize start to 0
 * and iterate through the array with i. We maintain a currentSum variable that
 * keeps track of the sum of elements from arr[start] to arr[i]. If currentSum
 * becomes greater than the given sum, we move the start pointer to the right
 * and subtract arr[start] from currentSum until currentSum becomes less than or
 * equal to sum. If currentSum becomes equal to the given sum, we print the
 * result as "Sum found between indexes start and i". If no subarray is found,
 * we print "No subarray found".
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class SubarrayWithGivenSum {

    public static void findSubarrayWithSum(int[] arr, int sum) {
        int currentSum = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            while (currentSum > sum && start < i) {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == sum) {
                System.out.println("Sum found between indexes " + start + " and " + i);
                return;
            }
        }
        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 20, 3, 10, 5};
        int sum1 = 33;
        findSubarrayWithSum(arr1, sum1);

        int[] arr2 = {1, 4, 0, 0, 3, 10, 5};
        int sum2 = 7;
        findSubarrayWithSum(arr2, sum2);

        int[] arr3 = {1, 4};
        int sum3 = 0;
        findSubarrayWithSum(arr3, sum3);
    }
}
