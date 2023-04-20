package com.mycompany.java.fundamentals.datastructures.linkedlist.codingproblems.middleoflinkedlist;

/**
 * Find the middle of a given linked list.
 *
 * Auxiliary Given a singly linked list, find the middle of the linked list. For
 * example, if the given linked list is 1->2->3->4->5 then the output should be
 * 3. If there are even nodes, then there would be two middle nodes, we need to
 * print the second middle element. For example, if the given linked list is
 * 1->2->3->4->5->6 then the output should be 4.
 *
 * The logic for finding the middle element of a linked list is to use two
 * pointers - slow and fast. The slow pointer moves one step at a time, while
 * the fast pointer moves two steps at a time. By the time the fast pointer
 * reaches the end of the linked list, the slow pointer would have reached the
 * middle element (or the second middle element in case of even number of
 * nodes). We return the node pointed by the slow pointer as the middle element.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
// Definition of a singly linked list node
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        // Create a sample linked list
        Node head = new Node(1);

        System.out.println("Original Linked List: ");
        printLinkedList(head);

        Node middle = findMiddle(head);

        if (middle != null) {
            System.out.println("\nMiddle Element: " + middle.data);
        }

        // new node
        {
            head.next = new Node(2);
            System.out.println("Original Linked List: ");
            printLinkedList(head);

            middle = findMiddle(head);

            if (middle != null) {
                System.out.println("\nMiddle Element: " + middle.data);
            }
        }
        // new node
        {
            head.next.next = new Node(3);

            System.out.println("Original Linked List: ");
            printLinkedList(head);

            middle = findMiddle(head);

            if (middle != null) {
                System.out.println("\nMiddle Element: " + middle.data);
            }
        }
        // new node
        {
            head.next.next.next = new Node(4);

            System.out.println("Original Linked List: ");
            printLinkedList(head);

            middle = findMiddle(head);

            if (middle != null) {
                System.out.println("\nMiddle Element: " + middle.data);
            }
        }
        // new node
        {
            head.next.next.next.next = new Node(5);

            System.out.println("Original Linked List: ");
            printLinkedList(head);

            middle = findMiddle(head);

            if (middle != null) {
                System.out.println("\nMiddle Element: " + middle.data);
            }
        }
        // new node
        {
            head.next.next.next.next.next = new Node(6);

            System.out.println("Original Linked List: ");
            printLinkedList(head);

            middle = findMiddle(head);

            if (middle != null) {
                System.out.println("\nMiddle Element: " + middle.data);
            }
        }
    }

    public static Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow = head;   // Slow pointer moves one step at a time
        Node fast = head;   // Fast pointer moves two steps at a time

        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow pointer by one step
            fast = fast.next.next;     // Move fast pointer by two steps
        }

        return slow; // Return the node pointed by slow pointer, which is the middle element
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
