package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/*
	A Java program to find a peak element.
	
	Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 
	
	Example:

		Input: array[]= {5, 10, 20, 15}
		Output: 20
		Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

		Input: array[] = {10, 20, 15, 2, 23, 90, 67}
		Output: 20 or 90
		Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
 */
public class Problem1 {

    public static void main(String[] args) {
        
        // Variable declaration
        int arr[] = {5, 10, 20, 15};
        int n = arr.length;
        
        // Showing results
        System.out.println("Peak: " + findPeak(arr, n));
    }

    static int findPeak(int arr[], int n) {

        // First or last element is peak element
        if (n == 1) {
            return arr[0];
        }
        if (arr[0] >= arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }
        // Check for every other element
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }
        return 0;
    }
}
