package com.mycompany.java.fundamentals.datastructures.linkedlist;

public class SinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();

        //Add nodes to the list   
        sList.push(1);
        sList.push(2);
        sList.push(3);
        sList.push(4);
        sList.push(5);

        //Displays the nodes present in the list    
        sList.display();

        System.out.println();
        System.out.println("Deleting from head ...");
        sList.deleteFromHead();
        sList.display();

        System.out.println();
        System.out.println("Delete node with value = 3 ...");
        sList.deleteNode(3);
        sList.display();

        System.out.println();
        System.out.println("Append a new node ...");
        sList.append(6);
        sList.display();

        System.out.println();
        System.out.println("Is there an element with value 2? ...");
        // Function call
        if (sList.search(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println();
        System.out.println("Is there an element with value 3? (recursive searh) ...");
        // Function call
        if (sList.searchRecursive(sList.head, 3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //Represent a node of the singly linked list    
    class Node {

        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    //Represent the head of the singly linked list    
    Node head = null;

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    //display() will display all the nodes present in the list    
    public void display() {
        //Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + "");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteFromHead() {
        head = head.next;
    }

    /* Given a key, deletes the first
       occurrence of key in
     * linked list */
    void deleteNode(int key) {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) {
            return;
        }

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    /* Appends a new node at the end.  This method is 
    defined inside LinkedList class shown above */
    public void append(int new_data) {
        /* 1. Allocate the Node &
		   2. Put in the data
		   3. Set next as null */
        Node new_node = new Node(new_data);

        /* 4. If the Linked List is empty, then make the
			   new node as head */
        if (head == null) {
            head = new Node(new_data);
            return;
        }

        /* 4. This new node is going to be the last node, so
			 make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }

    // Checks whether the value x is present in linked list
    public boolean search(int x) {
        Node current = head;

        while (current != null) {
            if (current.data == x) {
                return true;
            } else {
                current = current.next;
            }
        }

        return false;
    }

    // Checks whether the value x is present
    // in linked list
    public boolean searchRecursive(Node head, int x) {

        // Base case
        if (head == null) {
            return false;
        }

        // If key is present in current node,
        // return true
        if (head.data == x) {
            return true;
        }

        // Recur for remaining list
        return searchRecursive(head.next, x);
    }
}
