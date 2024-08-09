package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/**
 * Sort an array of 0s, 1s and 2s - Dutch National Flag problem
 *
 * Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a
 * function that sorts the given array. The functions should put all 0s first,
 * then all 1s and all 2s in last.
 *
 * This problem is also the same as the famous "Dutch National Flag problem".
 * The problem was proposed by Edsger Dijkstra. The problem is as follows:
 *
 * Given N balls of colour red, white or blue arranged in a line in random
 * order. You have to arrange all the balls such that the balls with the same
 * colours are adjacent with the order of the balls, with the order of the
 * colours being red, white and blue (i.e., all red coloured balls come first
 * then the white coloured balls and then the blue coloured balls). * Examples:
 * Input: {0, 1, 2, 0, 1, 2} Output: {0, 0, 1, 1, 2, 2}
 *
 * Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1} Output: {0, 0, 0, 0, 0, 1, 1, 1,
 * 1, 1, 2, 2}
 *
 *
 * The sort012 function sorts the array in-place using three pointers - low,
 * mid, and high. The low pointer keeps track of the next position to place 0,
 * the mid pointer iterates through the array, and the high pointer keeps track
 * of the next position to place 2. By swapping elements based on their values,
 * the array is sorted such that all 0s come first, followed by all 1s, and then
 * all 2s.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Sort012 {

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 0, 1, 2};
        int[] arr2 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        System.out.println("Original array 1: ");
        printArray(arr1);
        sort012(arr1);
        System.out.println("Sorted array 1: ");
        printArray(arr1);

        System.out.println("\nOriginal array 2: ");
        printArray(arr2);
        sort012(arr2);
        System.out.println("Sorted array 2: ");
        printArray(arr2);
    }

    // Function to sort an array of 0s, 1s, and 2s
    public static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: // If current element is 0
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1: // If current element is 1
                    mid++;
                    break;
                case 2: // If current element is 2
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    // Helper function to swap elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
