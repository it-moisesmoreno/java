package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/**
 * Given a sorted array arr[] and a number x, write a function that counts the
 * occurrences of x in arr[]. Expected time complexity is O(Logn) * Examples:
 * Input: arr[] = {1, 1, 2, 2, 2, 2, 3,}, x = 2 Output: 4 // x (or 2) occurs 4
 * times in arr[]
 *
 * Input: arr[] = {1, 1, 2, 2, 2, 2, 3,}, x = 3 Output: 1 * Input: arr[] = {1,
 * 1, 2, 2, 2, 2, 3,}, x = 1 Output: 2 * Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},
 * x = 4 Output: -1 // 4 doesn't occur in arr[]
 *
 * Here's a Java program that counts the occurrences of a given number in a
 * sorted array using binary search, with an expected time complexity of O(log
 * n).
 *
 * Note: This implementation assumes that the input array is sorted in ascending
 * order. If the array is not sorted, you may need to sort it first before using
 * this approach.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class CountOccurrences {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3}; // Input sorted array

        int x = 1; // Number to be counted
        int count = countOccurrences(arr, x); // Call the function to count occurrences
        System.out.println("Occurrences of " + x + ": " + count);

        //new input
        {
            x = 2; // Number to be counted
            count = countOccurrences(arr, x); // Call the function to count occurrences
            System.out.println("Occurrences of " + x + ": " + count);
        }

        //new input
        {
            x = 3; // Number to be counted
            count = countOccurrences(arr, x); // Call the function to count occurrences
            System.out.println("Occurrences of " + x + ": " + count);
        }

        //new input
        {
            x = 4; // Number to be counted
            count = countOccurrences(arr, x); // Call the function to count occurrences
            System.out.println("Occurrences of " + x + ": " + count);
        }
    }

    // Function to count occurrences of a number in a sorted array
    public static int countOccurrences(int[] arr, int x) {
        int firstIndex = findFirstIndex(arr, x); // Find the index of first occurrence of x

        // If x is not found in the array, return -1
        if (firstIndex == -1) {
            return -1;
        }

        int lastIndex = findLastIndex(arr, x); // Find the index of last occurrence of x

        // Return the count of occurrences of x
        return lastIndex - firstIndex + 1;
    }

    // Helper function to find the index of first occurrence of a number in a sorted array
    public static int findFirstIndex(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    // Helper function to find the index of last occurrence of a number in a sorted array
    public static int findLastIndex(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
