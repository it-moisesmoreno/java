package com.mycompany.java.fundamentals.datastructures.tree.codingproblems.level1.problem4;

/**
 * Symmetric Tree (Mirror Image of itself) Given a binary tree, check whether it
 * is a mirror of itself.
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

    // returns true if trees with roots as root1 and
    // root2 are mirror
    boolean isMirror(Node node1, Node node2) {

        // if both trees are empty, then they are mirror image
        if (node1 == null && node2 == null) {
            return true;
        }

        // For two trees to be mirror images, the following
        // three conditions must be true
        // 1.) Their root node's key must be same
        // 2.) left subtree of left tree and right subtree
        // of right tree have to be mirror images
        // 3.) right subtree of left tree and left subtree
        // of right tree have to be mirror images
        if (node1 != null && node2 != null && node1.data == node2.data) {
            return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
        }

        // if none of the above conditions is true then
        // root1 and root2 are not mirror images
        return false;
    }

    // returns true if the tree is symmetric i.e
    // mirror image of itself
    boolean isSymmetric() {
        // check if tree is mirror of itself
        return isMirror(root, root);
    }

    public void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.data);
        printInOrder(node.right);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating the tree
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        //tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(3);
        //tree.root.left.right = new Node(4);
        //tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);

        tree.printInOrder(tree.root);
        System.out.println("");

        boolean output = tree.isSymmetric();
        
        if(output == true){
            System.out.println("Symmetric");
        } else {
            System.out.println("Not symmetric");
        }

    }

}
