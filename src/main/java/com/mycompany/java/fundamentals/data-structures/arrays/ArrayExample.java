package com.mycompany.java.fundamentals.datastructures.arrays;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};

        showArray(arr);
        showElement(arr, 2);
        searchValue(arr, 2);
    }

    static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element[" + i + "]: " + arr[i]);
        }
    }

    static void showElement(int[] arr, int index) {
        System.out.println("Element[" + index + "]: " + arr[index]);
    }

    static void searchValue(int[] arr, int searched) {
        boolean result = false;
        int resultElement = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searched) {
                result = true;
                resultElement = i;
            }
        }

        if (result) {
            System.out.println("The value " + searched + " is in element[" + resultElement + "]");
        } else {
            System.out.println("No value found!");
        }
    }

}
