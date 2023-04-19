package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/*
	Move all negative numbers to beginning and positive to end with constant extra space
	
	An array contains both positive and negative numbers in random order. 
	Rearrange the array elements so that all negative numbers appear before all positive numbers.

	Examples : 

	Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
	Output: -12 -13 -5 -7 -3 -6 11 6 5
 */
class Problem9 {

    public static void main(String args[]) {
        System.out.println("Move all negative numbers to beginning and positive to end with "
                + "constant extra space");
        System.out.println();

        int[] input = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.print("Input: ");
        printArray(input);

        input = reArrange(input);
        System.out.print("Output: ");
        printArray(input);
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static int[] reArrange(int[] input) {

        int arrLen = input.length;
        int[] temp = new int[arrLen];
        int count = 0;

        for (int i = 0; i < 2; i++) {
            for (int j : input) {
                if ((i == 0 && j < 0) || (i == 1 && j >= 0)) {
                    temp[count++] = j;
                }
            }
        }

        return temp;
    }
}
