package com.mycompany.java.fundamentals.opp.interfaces;

// Java program to demonstrate working of
// interface
// A simple interface
interface In2 {

    // public, static and final
    int a = 10;

    // public and abstract
    void display();

    default void displayNew() {
        System.out.println("hello");
    }
}

// A class that implements the interface
class TestClass2 implements In2 {

    // Implementing the capabilities of
    // interface.
    public void display() {
        System.out.println("Geek");
    }

    // Driver Code
    public static void main(String[] args) {
        TestClass2 t = new TestClass2();
        t.display();
        //System.out.println(a);
        t.displayNew();
    }
}
