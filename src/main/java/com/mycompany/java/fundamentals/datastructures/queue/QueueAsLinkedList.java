package com.mycompany.java.fundamentals.datastructures.queue;

// Java program for linked-list implementation of queue
// A class to represent a queue
// The queue, front stores the front node of LL and rear
// stores the last node of LL
public class QueueAsLinkedList {

    Node front;
    Node rear;

    // A linked list (LL) node to store a queue entry
    class Node {

        int data;
        Node next;

        // constructor to create a new linked list node
        Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (rear == null) {
            return true;
        } else {
            return false;
        }
    }

    // Method to add an key to the queue.
    void enqueue(int x) {
        Node new_node = new Node(x);

        if (rear == null) {
            rear = new_node;
            front = rear;
        } else {
            rear.next = new_node;
            rear = new_node;
        }
        System.out.println(x + " enqueue to queue");
    }

    // Method to remove an key from queue.
    void dequeue() {
        if (front == null) {
            System.out.println("Stack is Empty");
        } else {
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {

        QueueAsLinkedList qll = new QueueAsLinkedList();

        qll.enqueue(10);
        qll.enqueue(20);
        qll.dequeue();
        qll.dequeue();
        qll.enqueue(30);
        qll.enqueue(40);
        qll.enqueue(50);
        qll.dequeue();

        System.out.println("Queue Front : " + ((qll.front != null) ? (qll.front).data : -1));
        System.out.println("Queue Rear : " + ((qll.rear != null) ? (qll.rear).data : -1));
    }
}
