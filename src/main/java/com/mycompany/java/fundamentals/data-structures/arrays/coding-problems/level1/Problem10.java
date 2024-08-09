package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/*
	Union and Intersection of two sorted arrays
	
	Given two sorted arrays, find their union and intersection.
	
	Example:

	Input: arr1[] = {1, 3, 4, 5, 7}
		   arr2[] = {2, 3, 5, 6} 
	Output: Union : {1, 2, 3, 4, 5, 6, 7} 
			Intersection : {3, 5}

	Input: arr1[] = {2, 5, 6}
		   arr2[] = {4, 6, 8, 10} 
	Output: Union : {2, 4, 5, 6, 8, 10} 
			Intersection : {6}
 */
public class Problem10 {

    public static void main(String[] args) {
        System.out.println("Union and Intersection of two sorted arrays");
        System.out.println();

        // new inputs
        {
            int[] input1 = {1, 3, 4, 5, 7};
            int[] input2 = {2, 3, 5, 6};

            System.out.print("Input 1: ");
            printArray(input1);
            System.out.print("Input 2: ");
            printArray(input2);

            int[] output = union(input1, input2);
            System.out.print("Union: ");
            printArray(output);

            output = intersection(input1, input2);
            System.out.print("Intersection: ");
            printArray(output);
        }
        System.out.println();

        // new inputs
        {
            int[] input1 = {2, 5, 6};
            int[] input2 = {4, 6, 8, 10};

            System.out.print("Input 1: ");
            printArray(input1);
            System.out.print("Input 2: ");
            printArray(input2);

            int[] output = union(input1, input2);
            System.out.print("Union: ");
            printArray(output);

            output = intersection(input1, input2);
            System.out.print("Intersection: ");
            printArray(output);
        }
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static int[] union(int[] input1, int[] input2) {
        int unionArrSize = input1.length + input2.length;

        for (int i : input1) {
            for (int j : input2) {
                if (i == j) {
                    unionArrSize--;
                }
            }
        }

        int[] unionArr = new int[unionArrSize];
        int count = 0;

        for (int i : input1) {
            unionArr[count++] = i;
        }

        for (int i : input2) {
            boolean repeated = false;

            for (int j : unionArr) {
                if (i == j) {
                    repeated = true;
                }
            }

            if (!repeated) {
                unionArr[count++] = i;
            }
        }

        int input1Count = 0, input2Count = 0;
        for (int i = 0; i < unionArrSize; i++) {

            if (input1Count > input1.length - 1) {
                unionArr[i] = input2[input2Count++];
            } else if (input2Count > input2.length - 1) {
                unionArr[i] = input1[input1Count++];
            } else if (input1[input1Count] == input2[input2Count]) {
                unionArr[i] = input1[input1Count];
                input1Count++;
                input2Count++;
            } else if (input1[input1Count] < input2[input2Count]) {
                unionArr[i] = input1[input1Count++];
            } else {
                unionArr[i] = input2[input2Count++];
            }

        }

        return unionArr;
    }

    static int[] intersection(int[] input1, int[] input2) {

        int intersectionArrSize = 0;

        for (int i : input1) {
            for (int j : input2) {
                if (i == j) {
                    intersectionArrSize++;
                }
            }
        }

        int[] intersection = new int[intersectionArrSize];

        int count = 0;

        for (int i : input1) {
            for (int j : input2) {
                if (i == j) {
                    intersection[count++] = j;
                }
            }
        }

        return intersection;

    }

}
