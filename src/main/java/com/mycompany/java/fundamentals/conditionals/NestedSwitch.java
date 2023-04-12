package com.mycompany.java.fundamentals.conditionals;

import java.util.Scanner;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class NestedSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String deparment = in.next();

        /* switch(empID){
			case 1:
				System.out.println("Hello emp 1");
				break;
			case 2:
				System.out.println("Hello emp 2");
				break;
			case 3:
				System.out.println("Emp Number 3");
				switch(deparment){
					case "IT":
						System.out.println("IT Department");
						break;
					case "Managment":
						System.out.println("Managment Deparment");
						break;
					default:
						System.out.println("No deparment entered");
				}
				break;
			default:
				System.out.println("Enter correct EmpID");
		} */
        switch (empID) {
            case 1 ->
                System.out.println("Hello emp 1");
            case 2 ->
                System.out.println("Hello emp 2");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (deparment) {
                    case "IT" ->
                        System.out.println("IT Department");
                    case "Managment" ->
                        System.out.println("Managment Deparment");
                    default ->
                        System.out.println("No deparment entered");
                }
            }
            default ->
                System.out.println("Enter correct EmpID");
        }
    }

}
