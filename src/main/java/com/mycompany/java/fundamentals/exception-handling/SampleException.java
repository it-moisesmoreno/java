package com.mycompany.java.fundamentals.exceptionhandling;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class SampleException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            throw new MyException(5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class MyException extends Exception {

    int a;

    MyException(int b) {
        a = b;
    }

    public String toString() {
        return ("Exception number = " + a);
    }
}
