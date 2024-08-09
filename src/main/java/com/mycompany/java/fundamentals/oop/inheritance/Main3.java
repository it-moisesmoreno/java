package com.mycompany.java.fundamentals.opp.inheritance;

// Java program to illustrate the
// concept of Multiple inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

interface one {

    public void print_geek();
}

interface two {

    public void print_for();
}

interface three extends one, two {

    public void print_geek();
}

class Child implements three{

    public void print_geek() {
        System.out.println("Geeks");
    }

    public void print_for() {
        System.out.println("for");
    }
}

// Drived class
public class Main3 {

    public static void main(String[] args) {
        Child c = new Child();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
