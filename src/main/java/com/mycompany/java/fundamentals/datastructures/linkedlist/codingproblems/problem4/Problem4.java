package com.mycompany.java.fundamentals.datastructures.linkedlist.codingproblems.problem4;

/**
 * Delete Middle of Linked List
 *
 * Given a singly linked list, delete middle of the linked list. For example, if
 * given linked list is 1->2->3->4->5 then linked list should be modified to
 * 1->2->4->5. If there are even nodes, then there would be two middle nodes, we
 * need to delete the second middle element. For example, if given linked list
 * is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6. If the input
 * linked list is NULL or has 1 node, then it should return NULL
 *
 * Example 1: Input: LinkedList: 1->2->3->4->5 Output: 1 2 4 5
 *
 * Example 2: Input: LinkedList: 2->4->6->7->5->1 Output: 2 4 6 5 1 Your
 * 
 * Task:The task is to complete the function deleteMid() which should delete the
 * middle element from the linked list and return the head of the modified
 * linked list. If the linked list is empty then it should return NULL.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
class Node {

    int data;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class Problem4 {

    public static Node deleteMid(Node head) {
        if (head == null) {
            return null;
        }

        Node slow, fast, previousSlow;
        slow = fast = previousSlow = head;

        while (fast != null && fast.right != null) {
            previousSlow = slow;
            slow = slow.right;
            fast = fast.right.right;
        }
        previousSlow.right = slow.right;
        return head;
    }

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Example 1
        {
            Node head = new Node(1);
            head.right = new Node(2);
            head.right.right = new Node(3);
            head.right.right.right = new Node(4);
            head.right.right.right.right = new Node(5);

            System.out.println("Input 1:");
            printList(head);

            System.out.println("Output 1:");
            head = deleteMid(head);
            printList(head);
        }

        // Example 2
        {
            Node head = new Node(2);
            head.right = new Node(4);
            head.right.right = new Node(6);
            head.right.right.right = new Node(7);
            head.right.right.right.right = new Node(5);
            head.right.right.right.right.right = new Node(1);

            System.out.println("Input 2:");
            printList(head);

            System.out.println("Output 2:");
            head = deleteMid(head);
            printList(head);
        }
        
        // Example 3
        {
            Node head = null;

            System.out.println("Input 3:");
            printList(head);

            System.out.println("Output 3:");
            head = deleteMid(head);
            printList(head);
        }
    }
}
