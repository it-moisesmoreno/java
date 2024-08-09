//program to print the exception information using getMessage() method
package com.mycompany.java.fundamentals.exceptionhandling;

import java.io.*;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Demo003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
