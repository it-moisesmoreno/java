package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/*
	Given an array A of size N of integers. 
	Your task is to find the minimum and maximum elements in the array.
	
	Input:
	N = 6
	A[] = {3, 2, 1, 56, 10000, 167}
	Output:
	min = 1, max =  10000
 */
class Problem2 {

    public static void main(String[] args) {
        int n = 6;
        int arr[] = {3, 2, 1, 56, 10000, 167};

        System.out.println("Min: " + getMin(arr));
        System.out.println("Max: " + getMax(arr));
    }

    static int getMin(int arr[]) {
        int min = arr[0];

        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }

    static int getMax(int arr[]) {
        int max = arr[0];

        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }
}
