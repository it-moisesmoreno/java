package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/**
 * Given an array arr[] of size N, the task is to sort this array in ascending
 * order in Java. Examples:  *
 * Input: arr[] = {0, 23, 14, 12, 9} Output: {0, 9, 12, 14, 23}
 *
 * Input: arr[] = {7, 0, 2} Output: {0, 2, 7}
 *
 *
 * Here's a Java program to sort an array in ascending order without using the
 * built-in Arrays.sort() method. We will use the Selection Sort algorithm to
 * sort the array.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class SortArrayWithoutArraysSort {

    public static void main(String[] args) {
        int[] arr1 = {0, 23, 14, 12, 9}; // Input array 1
        int[] arr2 = {7, 0, 2}; // Input array 2

        System.out.println("Original Array 1:");
        printArray(arr1); // Print original array 1

        selectionSort(arr1); // Sort array 1

        System.out.println("Sorted Array 1:");
        printArray(arr1); // Print sorted array 1

        System.out.println("Original Array 2:");
        printArray(arr2); // Print original array 2

        selectionSort(arr2); // Sort array 2

        System.out.println("Sorted Array 2:");
        printArray(arr2); // Print sorted array 2
    }

    // Function to perform Selection Sort on an array
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the remaining unsorted subarray
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
