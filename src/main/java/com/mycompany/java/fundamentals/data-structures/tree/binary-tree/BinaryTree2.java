package com.mycompany.java.fundamentals.datastructures.tree.binarytree;

// Java program for different tree traversals
/* Class containing left and right child of current
   node and key value*/
class Node2 {

    int key;
    Node2 left, right;

    public Node2(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree2 {

    // Root of Binary Tree
    Node2 root;

    BinaryTree2() {
        root = null;
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node2 node) {
        if (node == null) {
            return;
        }

        /*first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left subtree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    // Wrappers over above recursive functions
    void printPreorder() {
        printPreorder(root);
    }

    // Driver code
    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();
        tree.root = new Node2(1);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);

        // Function call
        System.out.println(
                "Preorder traversal of binary tree is ");
        tree.printPreorder();
    }
}
