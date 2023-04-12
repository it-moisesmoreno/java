package com.mycompany.java.fundamentals.conditionals;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Demo001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Syntax of if statements:
            if(boolean expression T or F){
                    // body
            }else{
                    // do this
            }
         */

        int salary = 25400;

        /* 
            if( salary > 10000){
		salary = salary + 2000;
            } else{
		salary = salary + 1000;
            } 
         */
        if (salary > 10000) {
            salary += 2000; // salary = salary + 2000
        } else if (salary > 20000) {
            salary += 3000;
        } else {
            salary += 1000;
        }

        System.out.println(salary);
    }

}
