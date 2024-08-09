package com.mycompany.java.fundamentals.datastructures.linkedlist.codingproblems.problem2;

/*
	Flattening a Linked List
	
	Given a linked list where every node represents a linked list and contains two pointers of its type: 

	Pointer to next node in the main list (we call it ‘right’ pointer in the code below) 
	Pointer to a linked list where this node is headed (we call it the ‘down’ pointer in the code below). 
	Note: All linked lists are sorted and the resultant linked list should also be sorted
	

	Examples: 

	Input:   5 -> 10 -> 19 -> 28
                |    |     |     |
                V    V     V     V
                7    20    22    35
                |          |     |
                V          V     V
                8          50    40
                |                |
                V                V
                30               45
	
	Output: 5->7->8->10->19->20->22->28->30->35->40->45->50
	
	Input:   3 -> 10 -> 7 -> 14
                |    |     |    |
                V    V     V    V
                9    47    15   22
                |          |        
                V          V      
                17         30

	Output: 3->7->9->10->14->15->17->22->30->47   
	
 */
class Node {

    Node right;
    Node down;
    int data;

    Node(int d) {
        data = d;
    }
}

class Problem2 {

    public static void main(String[] args) {
        System.out.println("Flattening a Linked List");
        System.out.println();

        // new input
        {
            // creating nodes
            Node n0 = new Node(5);
            Node n1 = new Node(7);
            Node n2 = new Node(8);
            Node n3 = new Node(30);

            Node n4 = new Node(10);
            Node n5 = new Node(20);

            Node n6 = new Node(19);
            Node n7 = new Node(22);
            Node n8 = new Node(50);

            Node n9 = new Node(28);
            Node n10 = new Node(35);
            Node n11 = new Node(40);
            Node n12 = new Node(45);

            // creating down lists
            n0.down = n1;
            n1.down = n2;
            n2.down = n3;

            n4.down = n5;

            n6.down = n7;
            n7.down = n8;

            n9.down = n10;
            n10.down = n11;
            n11.down = n12;

            // creating right list
            n0.right = n4;
            n4.right = n6;
            n6.right = n9;

            printList(n0);

            printList(flattening(n0));
        }

        // new input
        {
            // creating nodes
            Node n0 = new Node(3);
            Node n1 = new Node(9);
            Node n2 = new Node(17);

            Node n3 = new Node(10);
            Node n4 = new Node(47);

            Node n5 = new Node(7);
            Node n6 = new Node(15);
            Node n7 = new Node(30);

            Node n8 = new Node(14);
            Node n9 = new Node(22);

            // creating down lists
            n0.down = n1;
            n1.down = n2;

            n3.down = n4;

            n5.down = n6;
            n6.down = n7;

            n8.down = n9;

            // creating right list
            n0.right = n3;
            n3.right = n5;
            n5.right = n8;

            printList(n0);

            printList(flattening(n0));
        }
    }

    static void printList(Node main) {
        Node tempRight = main;

        while (tempRight != null) {

            System.out.print(tempRight.data + " ");
            Node tempDown = tempRight.down;

            while (tempDown != null) {
                System.out.print(tempDown.data + " ");
                tempDown = tempDown.down;
            }

            tempRight = tempRight.right;
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }

    static Node flattening(Node main) {
        Node tempRight = main;
        Node startFlatteningList = new Node(main.data);
        Node lastSortNode = startFlatteningList;

        while (tempRight != null) {

            if (tempRight.data < lastSortNode.data) {
                Node temp = startFlatteningList;

                while (temp.right.data < tempRight.data) {
                    temp = temp.right;
                }

                Node newSortNode = new Node(tempRight.data);
                newSortNode.right = temp.right;
                temp.right = newSortNode;
            } else {
                if (tempRight.data != startFlatteningList.data) {
                    Node newSortNode = new Node(tempRight.data);
                    System.out.println("newSortNode: " + newSortNode.data);
                    lastSortNode.right = newSortNode;
                    lastSortNode = newSortNode;
                }
            }

            Node tempDown = tempRight.down;

            while (tempDown != null) {
                if (tempDown.data < lastSortNode.data) {
                    Node temp = startFlatteningList;

                    while (temp.right.data < tempDown.data) {
                        temp = temp.right;
                    }

                    Node newSortNode = new Node(tempDown.data);
                    newSortNode.right = temp.right;
                    temp.right = newSortNode;
                } else {
                    Node newSortNode = new Node(tempDown.data);
                    lastSortNode.right = newSortNode;
                    lastSortNode = newSortNode;
                }
                tempDown = tempDown.down;
            }

            tempRight = tempRight.right;
        }

        return startFlatteningList;
    }
}
