package com.mycompany.java.fundamentals.datastructures.arrays.codingproblems.level1;

/*
	Count number of occurrences (or frequency) in a sorted array
	
	Examples: 

	Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
	Output: 4 // x (or 2) occurs 4 times in arr[]

	Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
	Output: 1 

	Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
	Output: 2 

	Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
	Output: -1 // 4 doesn't occur in arr[] 
*/

class Problem6{
	public static void main(String[] args){
		System.out.println("Count number of occurrences (or frequency) in a sorted array");
		System.out.println();
		
		//new input
		{
			int[] input = {1, 1, 2, 2, 2, 2, 3};
			int x = 2;
			
			System.out.print("Input: ");
			printArray(input);
			System.out.println();
			
			System.out.println("x (or " + x +") occurs "+ countOccurrence(input, x) 
				+ " times in arr[]");
		}
		
		// new input
		{
			int[] input = {1, 1, 2, 2, 2, 2, 3};   
			int x = 3;
			
			System.out.print("Input: ");
			printArray(input);
			System.out.println();
			
			System.out.println("x (or " + x +") occurs "+ countOccurrence(input, x) 
				+ " times in arr[]");
		}
		
		// new input
		{
			int[] input = {1, 1, 2, 2, 2, 2, 3,};
			int x = 1;
			
			System.out.print("Input: ");
			printArray(input);
			System.out.println();
			
			System.out.println("x (or " + x +") occurs "+ countOccurrence(input, x) 
				+ " times in arr[]");
		}
		
		// new input
		{
			int[] input = {1, 1, 2, 2, 2, 2, 3,};
			int x = 4;
			
			System.out.print("Input: ");
			printArray(input);
			System.out.println();
			
			System.out.println("x (or " + x +") occurs "+ countOccurrence(input, x) 
				+ " times in arr[]");
		}
	}
	
	static void printArray(int[] arr){
		for(int i: arr)
			System.out.print(i + " ");
	}
	
	static int countOccurrence(int[] arr, int x){
		int countOccurrences = 0;
		
		for(int i: arr)
			if(i == x)
				countOccurrences++;
		
		return countOccurrences;
	}
	
}