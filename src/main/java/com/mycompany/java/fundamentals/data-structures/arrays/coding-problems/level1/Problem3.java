package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/*
	Write a program to reverse an array or string
	
	Input  : arr[] = {1, 2, 3}
	Output : arr[] = {3, 2, 1}

	Input :  arr[] = {4, 5, 1, 2}
	Output : arr[] = {2, 1, 5, 4}
 */
class Problem3 {

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3};

        System.out.println("Input 1:");
        printArray(input1);

        input1 = reverse(input1);

        System.out.println("Output 1:");
        printArray(input1);

        int[] input2 = {4, 5, 1, 2};

        System.out.println("Input 2:");
        printArray(input2);

        input2 = reverse(input2);

        System.out.println("Output 2:");
        printArray(input2);
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

    static int[] reverse(int[] arr) {
        int len = arr.length;
        int[] tempArr = new int[len];

        for (int i = 0; i < len; i++) {
            tempArr[i] = arr[len - 1 - i];
        }

        return tempArr;
    }
}
