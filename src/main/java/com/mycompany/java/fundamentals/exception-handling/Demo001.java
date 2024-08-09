//program to print the exception information using printStackTrace() method
package com.mycompany.java.fundamentals.exceptionhandling;

import java.io.*;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Demo001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        //System.out.println(a/b);
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}
