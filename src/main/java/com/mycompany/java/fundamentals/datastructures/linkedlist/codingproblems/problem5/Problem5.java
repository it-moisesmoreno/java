package com.mycompany.java.fundamentals.datastructures.linkedlist.codingproblems.problem5;

/**
 * Remove duplicate element from sorted Linked List
 *
 * Given a singly linked list consisting of N nodes. The task is to remove
 * duplicates (nodes with duplicate values) from the given list (if exists).
 * Note: Try not to use extra space. Expected time complexity is O(N). The nodes
 * are arranged in a sorted way.
 *
 * Example 1:
 *
 * Input: LinkedList: 2->2->4->5 Output: 2 4 5 Explanation: In the given linked
 * list 2 ->2 -> 4-> 5, only 2 occurs more than 1 time.
 *
 *
 * Example 2:
 *
 * Input: LinkedList: 2->2->2->2->2 Output: 2 Explanation: In the given linked
 * list 2 ->2 ->2 ->2 ->2, 2 is the only element and is repeated 5 times.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Problem5 {

    public static Node removeDuplicates(Node head) {
        // if head is null
        if (head == null || head.next == null) {
            return head;
        }

        // get the middle of the list
        Node middle = getMiddle(head);
        Node nextToMiddle = middle.next;

        // set the next of middle node to null
        middle.next = null;

        // apply removeDuplicates on left list
        Node left = removeDuplicates(head);

        // apply removeDuplicates on right list
        Node right = removeDuplicates(nextToMiddle);

        // Merge the left and right lists
        Node removedList = removedMerge(left, right);

        return removedList;
    }

    public static Node removedMerge(Node a, Node b) {
        Node result = null;

        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        // ignore equals
        if (a.data == b.data) {
            result = a;
            result.next = removedMerge(a.next, b.next);
        } else {
            result = a;
            result.next = removedMerge(a.next, b);
        }

        return result;

    }

    public static Node getMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node slow, fast;
        slow = fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Example 1
        {
            Node head = new Node(2);
            head.next = new Node(2);
            head.next.next = new Node(4);
            head.next.next.next = new Node(5);

            System.out.println("Input: ");
            printList(head);

            System.out.println("Output: ");
            Node removedList = removeDuplicates(head);
            printList(removedList);
        }

        // Example 2
        {
            Node head = new Node(2);
            head.next = new Node(2);
            head.next.next = new Node(2);
            head.next.next.next = new Node(2);
            head.next.next.next.next = new Node(2);

            System.out.println("Input: ");
            printList(head);

            System.out.println("Output: ");
            Node removedList = removeDuplicates(head);
            printList(removedList);
        }

        // Example 3
        {
            Node head = new Node(4);
            head.next = new Node(5);
            head.next.next = new Node(2);
            head.next.next.next = new Node(2);

            System.out.println("Input: ");
            printList(head);

            System.out.println("Output: ");
            Node removedList = removeDuplicates(head);
            printList(removedList);
        }
        
        // Example 4
        {
            Node head = new Node(2);
            head.next = new Node(2);
            head.next.next = new Node(2);
            head.next.next.next = new Node(2);
            head.next.next.next.next = new Node(3);

            System.out.println("Input: ");
            printList(head);

            System.out.println("Output: ");
            Node removedList = removeDuplicates(head);
            printList(removedList);
        }
        
        // Example 5
        {
            Node head = new Node(3);
            head.next = new Node(2);
            head.next.next = new Node(2);
            head.next.next.next = new Node(2);
            head.next.next.next.next = new Node(2);

            System.out.println("Input: ");
            printList(head);

            System.out.println("Output: ");
            Node removedList = removeDuplicates(head);
            printList(removedList);
        }
    }
}
