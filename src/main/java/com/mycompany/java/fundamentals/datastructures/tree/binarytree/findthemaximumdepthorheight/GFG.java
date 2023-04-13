package com.mycompany.java.fundamentals.datastructures.tree.binarytree.findthemaximumdepthorheight;

// Java program for above approach
import java.util.LinkedList;
import java.util.Queue;

class GFG {

    // A tree node structure
    static class Node1 {

        int key;
        Node1 left;
        Node1 right;
    }

    // Utility function to create
    // a new node
    static Node1 newNode(int key) {
        Node1 temp = new Node1();
        temp.key = key;
        temp.left = temp.right = null;
        return temp;
    }

    /*Function to find the height(depth) of the tree*/
    public static int height(Node1 root) {

        // Initialising a variable to count the
        // height of tree
        int depth = 0;

        Queue<Node1> q = new LinkedList<>();

        //Pushing first level element along with null
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node1 temp = q.peek();
            q.remove();

            // When null encountered, increment the value
            if (temp == null) {
                depth++;
            }

            // If null not encountered, keep moving
            if (temp != null) {
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            } // If queue still have elements left,
            // push null again to the queue
            else if (!q.isEmpty()) {
                q.add(null);
            }
        }
        return depth;
    }

    // Driver Code
    public static void main(String args[]) {
        Node1 root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);

        root.left.left = newNode(4);
        root.left.right = newNode(5);

        System.out.println("Height(Depth) of tree is: "
                + height(root));
    }
}
 
// This code is contributed by jana_sayantan.
