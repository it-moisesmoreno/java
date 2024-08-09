package com.mycompany.java.fundamentals.opp;

// Java program to show that interfaces can
// have methods from JDK 1.8 onwards
interface In2 {

    final int a = 10;

    default void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class TestClass3 implements In2 {
    // Driver Code

    public static void main(String[] args) {
        TestClass3 t = new TestClass3();
        t.display();
    }
}
