package com.mycompany.java.fundamentals.opp;

// Java program to demonstrate working of
// interface
// A simple interface
interface In1 {

    // public, static and final
    int a = 10;

    //public and abstract
    void display();
}

// A class that implements the interface
class TestClass implements In1 {

    // Implementing the capabilities of
    // interface.
    public void display() {
        System.out.println("Geek");
    }

    // Driver Code
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);

        TestClass2 t2 = new TestClass2();
        t2.display();
        System.out.println("t2.a:" + t2.a);

    }
}

class TestClass2 implements In1 {

    // Implementing the capabilities of
    // interface.
    public void display() {
        System.out.println("TestClass2 - a:" + a);
    }
}
