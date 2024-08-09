package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/*
	Find Subarray with given sum | Set 1 (Non-negative Numbers)
	
	Given an array arr[] of non-negative integers and an integer sum, 
	find a subarray that adds to a given sum.

	Note: There may be more than one subarray with sum as the given sum, 
	print first such subarray. 

	Examples: 

	Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
	Output: Sum found between indexes 2 and 4
	Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
	
	Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
	Output: Sum found between indexes 1 and 4
	Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7

	Input: arr[] = {1, 4}, sum = 0
	Output: No subarray found
	Explanation: There is no subarray with 0 sum
 */
class Problem8 {

    public static void main(String[] args) {
        System.out.println("Find Subarray with given sum");
        System.out.println();

        // new input
        {
            int[] input = {1, 4, 20, 3, 10, 5};
            int sum = 33;

            System.out.print("Input: ");
            printArray(input);
            System.out.print(", sum = " + sum);
            System.out.println();

            findSubArray(input, sum);
        }
        System.out.println();

        // new input
        {
            int[] input = {1, 4, 0, 0, 3, 10, 5};
            int sum = 7;

            System.out.print("Input: ");
            printArray(input);
            System.out.print(", sum = " + sum);
            System.out.println();

            findSubArray(input, sum);
        }
        System.out.println();

        // new input
        {
            int[] input = {1, 4};
            int sum = 0;

            System.out.print("Input: ");
            printArray(input);
            System.out.print(", sum = " + sum);
            System.out.println();

            findSubArray(input, sum);
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void findSubArray(int[] arr, int givenSum) {

        for (int i = 0; i < arr.length; i++) {
            int subSum = 0;

            for (int j = i; j < arr.length; j++) {
                subSum += arr[j];
                if (givenSum == subSum) {
                    System.out.println("Output: Sum found between indexes " + i + " and " + j);
                    return;
                }
            }
        }

    }
}
