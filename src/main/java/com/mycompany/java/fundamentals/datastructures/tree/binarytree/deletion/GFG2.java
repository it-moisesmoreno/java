package com.mycompany.java.fundamentals.datastructures.tree.binarytree.deletion;

// Java program to delete element in binary tree
import java.util.LinkedList;
import java.util.Queue;

class GFG2 {
    // A binary tree node has key, pointer to left child and
    // a pointer to right child

    static class Node2 {

        int data;
        Node2 left, right;

        public Node2(int key) {
            this.data = key;
        }
    }

    // Inorder traversal of a binary tree
    static void inorder(Node2 root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static Node2 deletion(Node2 root, int key) {

        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return root.data == key ? root : null;
        }

        Node2 keyNode = null, temp = null, last = null;
        Queue<Node2> q = new LinkedList<>();
        q.offer(root);

        // Do level order traversal to find deepest
        // node(temp), node to be deleted (key_node)
        // and parent of deepest node(last)
        while (!q.isEmpty()) {
            temp = q.poll();

            if (temp.data == key) {
                keyNode = temp;
            }

            if (temp.left != null) {
                last = temp; // storing the parent node
                q.offer(temp.left);
            }

            if (temp.right != null) {
                last = temp; // storing the parent node
                q.offer(temp.right);
            }
        }

        if (keyNode != null) {
            keyNode.data = temp.data; // replacing key_node's data to deepest node's data

            if (last.right == temp) {
                last.right = null;
            } else {
                last.left = null;
            }
        }

        return root;
    }

    public static void main(String args[]) {
        Node2 root = new Node2(9);
        root.left = new Node2(2);
        root.left.left = new Node2(4);
        root.left.right = new Node2(7);
        root.right = new Node2(8);

        System.out.print(
                "Inorder traversal before deletion : ");
        inorder(root);
        System.out.println();

        int key = 7;
        root = deletion(root, key);

        System.out.print(
                "Inorder traversal after deletion : ");
        inorder(root);
        System.out.println();
    }
}
