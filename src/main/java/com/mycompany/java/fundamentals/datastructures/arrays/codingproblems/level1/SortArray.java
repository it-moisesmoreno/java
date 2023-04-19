package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/**
 * Given an array arr[] of size N, the task is to sort this array in ascending
 * order. Examples: * Input: arr[] = {0, 23, 14, 12, 9} Output: {0, 9, 12, 14,
 * 23}
 *
 * Input: arr[] = {7, 0, 2} Output: {0, 2, 7}
 *
 * Here's a Java program to sort an array in ascending order using the
 * built-in Arrays.sort() method.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] arr1 = {0, 23, 14, 12, 9}; // Input array 1
        int[] arr2 = {7, 0, 2}; // Input array 2

        System.out.println("Original Array 1:");
        printArray(arr1); // Print original array 1

        Arrays.sort(arr1); // Sort array 1

        System.out.println("Sorted Array 1:");
        printArray(arr1); // Print sorted array 1

        System.out.println("Original Array 2:");
        printArray(arr2); // Print original array 2

        Arrays.sort(arr2); // Sort array 2

        System.out.println("Sorted Array 2:");
        printArray(arr2); // Print sorted array 2
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
