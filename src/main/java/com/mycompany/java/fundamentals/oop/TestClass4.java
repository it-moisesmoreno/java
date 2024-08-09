package com.mycompany.java.fundamentals.opp;

// Java Program to show that interfaces can
// have methods from JDK 1.8 onwards
interface In3 {

    final int a = 10;

    static void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass4 implements In3 {
    // Driver Code

    public static void main(String[] args) {
        In3.display();
    }
}
