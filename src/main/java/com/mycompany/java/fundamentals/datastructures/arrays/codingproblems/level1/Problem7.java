package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/*
	Sort an array of 0s, 1s and 2s - Dutch National Flag problem
	
	Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a 
	function that sorts the given array. The functions should put all 0s first, then all 1s 
	and all 2s in last.

	This problem is also the same as the famous "Dutch National Flag problem". 
	The problem was proposed by Edsger Dijkstra. The problem is as follows:

	Given N balls of colour red, white or blue arranged in a line in random order. 
	You have to arrange all the balls such that the balls with the same colours are adjacent 
	with the order of the balls, with the order of the colours being red, 
	white and blue (i.e., all red coloured balls come first then the white coloured balls and 
	then the blue coloured balls). 
	
	Examples:
	Input: {0, 1, 2, 0, 1, 2}
	Output: {0, 0, 1, 1, 2, 2}

	Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
	Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
 */
class Problem7 {

    public static void main(String[] args) {
        System.out.println("Sort an array of 0s, 1s and 2s - Dutch National Flag problem");
        System.out.println();

        // new input
        {
            int[] input = {0, 1, 2, 0, 1, 2};

            System.out.print("Input: ");
            printArray(input);
            System.out.println();

            input = sortArray(input);
            System.out.print("Output: ");
            printArray(input);
            System.out.println();
        }

        System.out.println();

        // new input
        {
            int[] input = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

            System.out.print("Input: ");
            printArray(input);
            System.out.println();

            input = sortArray(input);
            System.out.print("Output: ");
            printArray(input);
            System.out.println();
        }

    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int[] sortArray(int[] arr) {

        int[] sArray = {0, 1, 2};
        int[] temp = new int[arr.length];
        int indexTemp = 0;

        for (int i : sArray) {
            for (int j : arr) {
                if (i == j) {
                    temp[indexTemp++] = j;
                }
            }
        }

        return temp;
    }
}
