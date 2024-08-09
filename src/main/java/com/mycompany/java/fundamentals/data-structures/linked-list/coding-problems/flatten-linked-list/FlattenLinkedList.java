package com.mycompany.java.fundamentals.datastructures.linkedlist.codingproblems.flattenlinkedlist;

/**
 * Flattening a Linked List
 *
 * Given a linked list where every node represents a linked list and contains
 * two pointers of its type:  *
 * Pointer to next node in the main list (we call it ‘right’ pointer in the code
 * below) Pointer to a linked list where this node is headed (we call it the
 * ‘down’ pointer in the code below). Note: All linked lists are sorted and the
 * resultant linked list should also be sorted
 *
 *
 * Examples:  *
 * Input:   5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
 *
 * Output: 5->7->8->10->19->20->22->28->30->35->40->45->50
 *
    Input:   3 -> 10 -> 7 -> 14
            |    |     |    |
            V    V     V    V
            9    47    15   22
            |          |        
            V          V      
            17         30
 *
 * Output: 3->7->9->10->14->15->17->22->30->47
 *
 * The flatten() method is used to flatten the linked list by recursively
 * merging the nodes. The merge() method is used to merge two linked lists in a
 * sorted order. Finally, the printList() method is used to print the flattened
 * linked list.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
class Node {

    int data;
    Node right, down;

    Node(int data) {
        this.data = data;
        right = null;
        down = null;
    }
}

public class FlattenLinkedList {

    public static Node flatten(Node head) {
        if (head == null || head.right == null) {
            return head;
        }
        head.right = flatten(head.right);
        head = merge(head, head.right);
        return head;
    }

    public static Node merge(Node a, Node b) {
        Node mergedList = new Node(0);
        Node current = mergedList;
        while (a != null && b != null) {
            if (a.data < b.data) {
                current.down = a;
                a = a.down;
            } else {
                current.down = b;
                b = b.down;
            }
            current = current.down;
        }
        current.down = (a != null) ? a : b;
        return mergedList.down;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.down;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.right = new Node(10);
        head.right.right = new Node(19);
        head.right.right.right = new Node(28);

        head.down = new Node(7);
        head.down.down = new Node(8);
        head.down.down.down = new Node(30);

        head.right.down = new Node(20);

        head.right.right.down = new Node(22);
        head.right.right.down.down = new Node(50);

        head.right.right.right.down = new Node(35);
        head.right.right.right.down.down = new Node(40);
        head.right.right.right.down.down.down = new Node(45);

        head = flatten(head);

        System.out.println("Flattened Linked List:");
        printList(head);

        // new input
        {
            // creating nodes
            head = new Node(3);
            head.right = new Node(10);
            head.right.right = new Node(7);
            head.right.right.right = new Node(14);

            head.down = new Node(9);
            head.down.down = new Node(17);

            head.right.down = new Node(47);

            head.right.right.down = new Node(15);
            head.right.right.down.down = new Node(30);

            head.right.right.right.down = new Node(22);

            head = flatten(head);

            System.out.println("Flattened Linked List:");
            printList(head);
        }
    }
}
