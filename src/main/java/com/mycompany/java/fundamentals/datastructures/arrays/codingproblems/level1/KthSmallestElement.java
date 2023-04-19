package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/**
 * Given an array and a number K where K is smaller than the size of the array.
 * Find the K’th smallest element in the given array. Given that all array
 * elements are distinct.
 *
 * Examples: * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 Output: 7
 *
 * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 Output: 10
 *
 * Note: This implementation assumes that the value of K is valid, i.e., it is
 * smaller than the size of the array. You may need to add additional error
 * handling or validation checks depending on your specific use case.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15}; // Input array
        int k = 3; // Value of K

        int kthSmallest = findKthSmallest(arr, k); // Call the function to find Kth smallest element
        System.out.println("Kth Smallest Element: " + kthSmallest);

        k = 4; // Value of K

        kthSmallest = findKthSmallest(arr, k); // Call the function to find Kth smallest element
        System.out.println("Kth Smallest Element: " + kthSmallest);
    }

    // Function to find the Kth smallest element in an array
    public static int findKthSmallest(int[] arr, int k) {
        // Sort the array in ascending order using any sorting algorithm
        // Here, we are using the Selection Sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Return the Kth smallest element
        return arr[k - 1];
    }
}
