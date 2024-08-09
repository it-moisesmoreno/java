package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/**
 * Java code to find the minimum and maximum elements in an array.
 *
 * Input: N = 6 A[] = {3, 2, 1, 56, 10000, 167} Output: min = 1, max = 10000
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class MinMaxArray {

    public static void main(String[] args) {
        int[] A = {3, 2, 1, 56, 10000, 167}; // Input array
        int N = A.length; // Size of the array

        // Initialize min and max to the first element of the array
        int min = A[0];
        int max = A[0];

        // Iterate through the array and update min and max accordingly
        for (int i = 1; i < N; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }

        // Print the minimum and maximum elements
        System.out.println("min = " + min + ", max = " + max);
    }
}
