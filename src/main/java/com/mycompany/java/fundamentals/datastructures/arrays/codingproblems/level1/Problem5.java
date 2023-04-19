package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/*
	K’th Smallest/Largest Element in Unsorted Array
	
	Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
	Output: 7

	Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
	Output: 10 
 */
class Problem5 {

    public static void main(String[] args) {
        System.out.println("Problem5 - Kth Smallest/Largest Element in Unsorted Array");
        System.out.println();

        int[] input1Arr = {7, 10, 4, 3, 20, 15};
        int K = 3;

        System.out.println("Input 1:");
        printArray(input1Arr);

        int kth = kthSmallest(input1Arr, K);

        System.out.println(K + "th smallest element: " + kth);

        K = 4;

        kth = kthSmallest(input1Arr, K);

        System.out.println(K + "th smallest element: " + kth);
    }

    static int kthSmallest(int[] inputArr, int K) {
        int len = inputArr.length;
        int[] smallestArray = new int[len];

        for (int i = 0; i < len; i++) {
            int smallestCount = 0;
            for (int j : inputArr) {
                if (inputArr[i] < j) {
                    smallestCount++;
                }
            }

            smallestArray[len - 1 - smallestCount] = inputArr[i];
        }

        return smallestArray[K - 1];
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
