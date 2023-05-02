package com.mycompany.java.advanced.collectionframework.listinterface;

import java.util.*;

class TestJavaCollection1 {

    public static void main(String args[]) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Vector<>();
        List<String> list4 = new Stack<>();

        list1.add("A");
        list2.add("B");
        list3.add("C");
        list4.add("D");

        list1.addAll(list2);
        list2.addAll(list3);
        list3.addAll(list4);
        list4.addAll(list1);

        // Use iterator to display contents of list1
        System.out.print("Original contents of list1: ");
        Iterator itr = list1.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Use iterator to display contents of list2
        System.out.print("Original contents of list2: ");
        itr = list2.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Use iterator to display contents of list3
        System.out.print("Original contents of list3: ");
        itr = list3.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Use iterator to display contents of list4
        System.out.print("Original contents of list4: ");
        itr = list4.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
