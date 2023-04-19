package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/**
 * Write a program to reverse an array or string
 *
 * Input : arr[] = {1, 2, 3} Output : arr[] = {3, 2, 1}
 *
 * Input : arr[] = {4, 5, 1, 2} Output : arr[] = {2, 1, 5, 4}
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3}; // Input array 1
        int[] arr2 = {4, 5, 1, 2}; // Input array 2

        System.out.println("Original Array 1:");
        printArray(arr1); // Print original array 1

        reverseArray(arr1); // Reverse array 1

        System.out.println("Reversed Array 1:");
        printArray(arr1); // Print reversed array 1

        System.out.println("Original Array 2:");
        printArray(arr2); // Print original array 2

        reverseArray(arr2); // Reverse array 2

        System.out.println("Reversed Array 2:");
        printArray(arr2); // Print reversed array 2
    }

    // Function to reverse an array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
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
