package com.mycompany.java.fundamentals.datatypesandvariables;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Demo001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte x;
        int a = 270;
        double b = 270.270;
        System.out.println("int converted to byte");
        x = (byte) a;
        System.out.println("a and x " + a + " " + x);
        System.out.println("double converted to int");
        a = (int) b;
        System.out.println("b and a " + b + " " + a);
        System.out.println("\ndouble converted to byte");
        x = (byte) b;
        System.out.println("b and x " + b + " " + x);
    }

}
