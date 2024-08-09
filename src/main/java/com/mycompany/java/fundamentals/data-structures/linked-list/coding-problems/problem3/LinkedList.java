package com.mycompany.java.fundamentals.datastructures.linkedlist.codingproblems.problem3;

/*
	Given some resources in the form of linked list you have to canceled out all 
	the resources whose sum up to 0(Zero) and return the remaining list.

	E.g-->> 6 -6 8 4 -12 9 8 -8

	the above example lists which gets canceled :
	6 -6
	8 4 -12
	8 -8
	o/p : 9
	case 3 : 4 6 -10 8 9 10 -19 10 -18 20 25
	O/P : 20 25
 */
class LinkedList {

    Node head;

    void printList(Node temp) {

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println();
    }

    // assuming the sum of subsets
    void sumUpToZero(Node head) {
        Node resource = head;

        while (resource != null) {

            for (int combinations = 1; combinations < getSize(); combinations++) {
                int sum = resource.data;
                Node pointerSublist = resource.next;

                for (int j = 0; j < combinations; j++) {

                    if (pointerSublist == null) {
                        break;
                    }

                    sum = sum + pointerSublist.data;

                    pointerSublist = pointerSublist.next;
                }

                if (sum == 0) {
                    cancel(resource, combinations);
                    break;
                }
            }

            resource = resource.next;
        }
    }

    void cancel(Node cancelHead, int combinations) {
        if (cancelHead == head) {
            for (int i = 0; i < combinations; i++) {
                cancelHead = cancelHead.next;
            }

            head = cancelHead.next;
        } else {

            Node temp = head;
            Node beforeTemp = null;

            while (temp != cancelHead) {
                beforeTemp = temp;
                temp = temp.next;
            }

            temp = cancelHead;
            for (int i = 0; i < combinations; i++) {
                temp = temp.next;
            }

            beforeTemp.next = temp.next;
        }

    }

    int getSize() {
        Node temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    public static void main(String[] args) {
        System.out.println("Delete the elements in an linked list whose sum is equal to zero");
        System.out.println();

        // new input
        {
            LinkedList list = new LinkedList();
            Node n0 = new Node(6);
            list.head = n0;
            Node n1 = new Node(-6);
            n0.next = n1;
            Node n2 = new Node(8);
            n1.next = n2;
            Node n3 = new Node(4);
            n2.next = n3;
            Node n4 = new Node(-12);
            n3.next = n4;
            Node n5 = new Node(9);
            n4.next = n5;
            Node n6 = new Node(8);
            n5.next = n6;
            Node n7 = new Node(-8);
            n6.next = n7;

            System.out.print("Input: ");
            list.printList(list.head);
            System.out.println();

            list.sumUpToZero(list.head);

            System.out.print("Otput: ");
            list.printList(list.head);

            System.out.println();
        }

        // new input
        {
            LinkedList list = new LinkedList();
            Node n0 = new Node(4);
            list.head = n0;
            Node n1 = new Node(6);
            n0.next = n1;
            Node n2 = new Node(-10);
            n1.next = n2;
            Node n3 = new Node(8);
            n2.next = n3;
            Node n4 = new Node(9);
            n3.next = n4;
            Node n5 = new Node(10);
            n4.next = n5;
            Node n6 = new Node(-19);
            n5.next = n6;
            Node n7 = new Node(10);
            n6.next = n7;
            Node n8 = new Node(-18);
            n7.next = n8;
            Node n9 = new Node(20);
            n8.next = n9;
            Node n10 = new Node(25);
            n9.next = n10;

            System.out.print("Input: ");
            list.printList(list.head);
            System.out.println();

            list.sumUpToZero(list.head);

            System.out.print("Otput: ");
            list.printList(list.head);

            System.out.println();
        }
    }
}

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}
