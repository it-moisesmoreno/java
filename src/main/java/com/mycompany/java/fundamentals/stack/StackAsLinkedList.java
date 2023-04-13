package com.mycompany.java.fundamentals.stack;

// Java Code for Linked List Implementation
public class StackAsLinkedList {

    Node top;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    void push(int x) {
        Node new_node = new Node(x);

        if (top == null) {
            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;
        }
        System.out.println(x + " pushed to stack");
    }

    void print() {
        if (top == null) {
            System.out.print("The stack is empty!");
        } else {
            Node current = top;
            while (current != null) {
                System.out.print(" " + current.data);
                current = current.next;
            }
        }
    }

    int pop() {
        int popped = Integer.MIN_VALUE;
        if (top == null) {
            System.out.println("Stack is Empty");
        } else {
            popped = top.data;
            top = top.next;
        }
        return popped;
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return top.data;
        }
    }

    // Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop()
                + " popped from stack");

        System.out.println("Top element is " + sll.peek());

        System.out.print("Elements present in stack :");
        sll.print();
    }
}
