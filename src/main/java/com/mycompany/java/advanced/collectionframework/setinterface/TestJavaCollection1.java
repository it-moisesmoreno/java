package com.mycompany.java.advanced.collectionframework.setinterface;

import java.util.*;

class TestJavaCollection1 {

    public static void main(String args[]) {
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new LinkedHashSet<>();
        Set<String> s3 = new TreeSet<>();

        s1.add("A");
        s1.add("A");
        s1.add(null);
        s1.add(null);
        s1.add("B");

        s2.add("A");
        s2.add("A");
        s2.add(null);
        s2.add(null);
        s2.add("B");

        s3.add("B");
        s3.add("A");
        s3.add("A");
        s3.add("C");

        // Use iterator to display contents of set1
        System.out.print("Original contents of set1: ");
        Iterator itr = s1.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Use iterator to display contents of set2
        System.out.print("Original contents of set2: ");
        itr = s2.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Use iterator to display contents of set3
        System.out.print("Original contents of set3: ");
        itr = s3.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
