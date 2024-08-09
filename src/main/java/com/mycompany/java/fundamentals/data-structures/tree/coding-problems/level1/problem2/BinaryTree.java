package com.mycompany.java.fundamentals.datastructures.tree.codingproblems.level1.problem2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Program to Determine if given Two Trees are Identical or not Write a function
 * to determine if two trees are identical or not:
 *
 * Two trees are identical when they have the same data and the arrangement of
 * data is also the same
 *
 * Examples:
 *
 * Input:         1                    1
                 /   \                /   \
               2      3            2      3
             /                    /
           4                   4
 *
 *
 * Output: Both trees are identical
 *
 * Input:         1                    1
                 /   \                /   \
               2      3            5      3
                     /             /
                  4             4
 *
 * Output: Trees are not identical
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

class BinaryTree {

    Node root;

    boolean areIdentical(Node rootTree1) {
        Queue<Node> queue0 = new LinkedList<Node>();
        Queue<Node> queue1 = new LinkedList<Node>();

        queue0.add(root);
        queue1.add(rootTree1);

        while (!queue0.isEmpty()) {
            if (queue1.isEmpty()) {
                return false;
            }

            Node tempNode0 = queue0.poll();
            Node tempNode1 = queue1.poll();

            if (tempNode0.data != tempNode1.data) {
                return false;
            }

            /*Enqueue left child */
            if (tempNode0.left != null) {
                queue0.add(tempNode0.left);

                if (tempNode1.left != null) {
                    queue1.add(tempNode1.left);
                }
            }

            /*Enqueue right child */
            if (tempNode0.right != null) {
                queue0.add(tempNode0.right);

                if (tempNode1.right != null) {
                    queue1.add(tempNode1.right);
                }
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creating first tree
        BinaryTree tree0 = new BinaryTree();
        tree0.root = new Node(1);
        tree0.root.left = new Node(2);
        tree0.root.right = new Node(3);
        tree0.root.left.left = new Node(4);

        // Creating second tree
        /*BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);*/
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(1);
        tree1.root.left = new Node(5);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);

        if(tree0.areIdentical(tree1.root)){
            System.out.println("Trees are identical.");
        }
        else{
            System.out.println("Trees aren't identical. ");
        }
    }

}
