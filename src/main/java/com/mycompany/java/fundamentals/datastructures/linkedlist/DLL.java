package com.mycompany.java.fundamentals.datastructures.linkedlist;

public class DLL {

    public static void main(String[] args) {
        DLL dList = new DLL();

        //Add nodes to the list   
        Node prev = dList.push(0);
        //Node prev = dList.push(1);
        //dList.push(7);
        //dList.insertAfter(prev, 6);
        dList.append(6);

        //Displays the nodes present in the list    
        dList.display();
    }

    //Represent a node of the singly linked list    
    class Node {

        Node prev;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    //Represent the head and tail of the singly linked list    
    Node head = null;

    public Node push(int data) {

        //Create a new node   
        Node newNode = new Node(data);

        //Checks if the list is empty 
        if (head == null) {
            //If list is empty, both head and tail will point to new node    
            head = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }

        return newNode;
    }

    //display() will display all the nodes present in the list    
    public void display() {
        //Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Nodes of double linked list: ");
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + "");
            current = current.next;
        }
        System.out.println();
    }

    /* Given a node as prev_node, insert a new node after the
	 * given node */
    public void insertAfter(Node prev_node, int new_data) {

        /*1. check if the given prev_node is NULL */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be NULL");
            return;
        }

        /* 2. allocate node
		  * 3. put in the data */
        Node new_node = new Node(new_data);

        /* 4. Make next of new node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. Make the next of prev_node as new_node */
        prev_node.next = new_node;

        /* 6. Make prev_node as previous of new_node */
        new_node.prev = prev_node;

        /* 7. change previous of new_node's next node */
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
    }

    // Add a node at the end of the list
    void append(int new_data) {
        /* 1. allocate node
		 * 2. put in the data */
        Node new_node = new Node(new_data);

        Node last = head;
        /* used in step 5*/

 /* 3. This new node is going to be the last node, so
		 * make next of it as NULL*/
        new_node.next = null;

        /* 4. If the Linked List is empty, then make the new
		 * node as head */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null) {
            last = last.next;
        }

        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.prev = last;
    }
}
