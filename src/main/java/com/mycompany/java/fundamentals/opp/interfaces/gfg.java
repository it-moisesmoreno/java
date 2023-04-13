package com.mycompany.java.fundamentals.opp.interfaces;

interface A {

    void method1();

    void method2();
}

// B now includes method1 and method2
interface B extends A {

    void method3();
}

class TestClassA implements A {

    public void method1() {
        System.out.println("Method 1 from TestClassA");
    }

    public void method2() {
        System.out.println("Method 2 from TestClassB");
    }
}

//the class must implement all method of A and B
class gfg implements B {

    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

    public void method3() {
        System.out.println("Method 3");
    }

    // This function returns an object of a class which implements the A interface.
    A returningTest() {
        return new TestClassA();
    }

    public static void main(String[] args) {
        gfg gfgObject = new gfg();
        A aObject = gfgObject.returningTest();
        aObject.method1();
    }

}
