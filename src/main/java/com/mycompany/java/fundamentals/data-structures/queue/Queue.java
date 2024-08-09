package com.mycompany.java.fundamentals.datastructures.queue;

// Java program for array
// implementation of queue
// A class to represent a queue
class Queue {

    int front, rear, size;
    int capacity;
    int[] arr;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        arr = new int[capacity];
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(int data) {

        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
        System.out.println(data + " enqueue to queue");
    }

    // Method to remove an item from queue.
    // It changes front and size
    int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int data = arr[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    // Queue is full when size becomes
    // equal to the capacity
    boolean isFull() {
        return (size == capacity);
    }

    // Method to get front of queue
    int front() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
            return Integer.MIN_VALUE;
        } else {
            return arr[front];
        }
    }

    // Queue is empty when size is 0
    boolean isEmpty() {
        return (size == 0);
    }

    // Method to get rear of queue
    int rear() {
        if (isEmpty()) {
            System.out.println("The queue is empty!");
            return Integer.MIN_VALUE;
        } else {
            return arr[rear];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());
    }
}
