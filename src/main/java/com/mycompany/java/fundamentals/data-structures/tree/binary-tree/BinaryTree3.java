package com.mycompany.java.fundamentals.datastructures.tree.binarytree;

// Java program for different tree traversals
/* Class containing left and right child of current
   node and key value*/
class Node3 {

    int key;
    Node3 left, right;

    public Node3(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree3 {

    // Root of Binary Tree
    Node3 root;

    BinaryTree3() {
        root = null;
    }

    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void printPostorder(Node3 node) {
        if (node == null) {
            return;
        }

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    // Wrappers over above recursive functions
    void printPostorder() {
        printPostorder(root);
    }

    // Driver code
    public static void main(String[] args) {
        BinaryTree3 tree = new BinaryTree3();
        tree.root = new Node3(1);
        tree.root.left = new Node3(2);
        tree.root.right = new Node3(3);
        tree.root.left.left = new Node3(4);
        tree.root.left.right = new Node3(5);

        // Function call
        System.out.println(
                "\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}
