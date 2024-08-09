package com.mycompany.java.fundamentals.datastructures.tree.binarytree;

// Java program for different tree traversals
/* Class containing left and right child of current
   node and key value*/
class Node1 {

    int key;
    Node1 left, right;

    public Node1(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree1 {

    // Root of Binary Tree
    Node1 root;

    BinaryTree1() {
        root = null;
    }

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node1 node) {
        if (node == null) {
            return;
        }

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    // Wrappers over above recursive functions
    void printInorder() {
        printInorder(root);
    }

    // Driver code
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);

        // Function call
        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.printInorder();
    }
}
