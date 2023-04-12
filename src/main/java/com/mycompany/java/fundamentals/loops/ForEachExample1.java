package com.mycompany.java.fundamentals.loops;

//An example of Java for-each loop  
class ForEachExample1 {

    public static void main(String args[]) {
        //declaring an array
        int arr[] = {12, 13, 14, 44};
        //travesing the array with for-each loop
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
