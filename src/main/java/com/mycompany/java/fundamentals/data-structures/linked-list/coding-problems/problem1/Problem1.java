package com.mycompany.java.fundamentals.datastructures.linkedlist.codingproblems.problem1;

/*
	Find the middle of a given linked list.
	
	Auxiliary Given a singly linked list, find the middle of the linked list. 
	For example, if the given linked list is 1->2->3->4->5 then the output should be 3. 
	If there are even nodes, then there would be two middle nodes, we need to print the second middle element. 
	For example, if the given linked list is 1->2->3->4->5->6 then the output should be 4. 
 */
public class Problem1 {

    public static void main(String[] args) {

        Problem1 findMiddle = new Problem1();

        for (int i = 5; i >= 1; i--) {
            findMiddle.push(i);
            findMiddle.display();
            findMiddle.middle();
        }

    }

    class Node {

        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    void push(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
        }
    }

    void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }

        System.out.print("NULL" + "\n");
    }

    void middle() {
        Node current = head;
        int middleIndex = getLen() / 2;

        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }

        System.out.print("The middle element is [" + current.data + "] \n");
        return;
    }

    /*Finding the length of the list.*/
    public int getLen() {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

}
