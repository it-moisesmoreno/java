package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/*
	Given an array arr[] of size N, the task is to sort this array in ascending order.
	
	Examples: 

	Input: arr[] = {0, 23, 14, 12, 9}
	Output: {0, 9, 12, 14, 23}

	Input: arr[] = {7, 0, 2}
	Output: {0, 2, 7}
 */
class Problem4 {

    public static void main(String args[]) {
        int arr[] = {7, 0, 2};

        System.out.println("Before sort: ");

        printArray(arr);

        sort(arr);

        System.out.println("Sorted array:");

        printArray(arr);

    }

    static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
