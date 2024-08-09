package com.mycompany.java.fundamentals.datastructures.tree.codingproblems.level1.problem5;

/**
 * Diameter of a Binary Tree in O(n) [A new method]
 *
 * The diameter of a tree is the number of nodes on the longest path between two
 * leaves in the tree. The diagram below shows two trees each with diameter
 * nine, the leaves that form the ends of the longest path are colored (note
 * that there may be more than one path in the tree of the same diameter).
 *
 * Examples:  
Input :     1
          /   \
        2      3
      /  \
    4     5

Output : 4

Input :     1
          /   \
        2      3
      /  \ .    \
    4     5 .    6

Output : 5
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
class Node {

    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {

    Node root;
    int diameter;

    int height(Node node) {

        if (node == null) {
            return 0;
        }

        int left_height = height(node.left);
        int right_height = height(node.right);

        this.diameter = Math.max(this.diameter, 1 + left_height + right_height);
        return 1 + Math.max(left_height, right_height);
    }

    int diameter() {
        height(this.root);
        return this.diameter;
    }

    void printPreOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data);
        printPreOrder(node.left);
        printPreOrder(node.right);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creating the tree
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        // printing the tree
        tree.printPreOrder(tree.root);

        // Getting the diameter
        System.out.println("");
        System.out.println("Diameter is " + tree.diameter());

    }

}
