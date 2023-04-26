package com.mycompany.java.fundamentals.datastructures.tree.codingproblems.level1.problem3;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, the task is to convert the binary tree into its Mirror
 * tree. Mirror of a Binary Tree T is another Binary Tree M(T) with left and
 * right children of all non-leaf nodes interchanged.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
class Node{
    Node left;
    Node right;
    int data;
    
    Node(int data){
        this.data = data;
    }
}

public class BinaryTree{
    Node root;
    
    public void mirror(){
        root = mirror(root);
    }
    
    Node mirror(Node node){
        if(node == null)
            return node;
        
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        
        node.left = right;
        node.right = left;
        
        return node;
    }
    
    public void printTree(Node rootP){
        if(root == null)
            return;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(rootP);
        
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data);
            
            if(temp.left != null){
                queue.add(temp.left);
            }
            
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        
    }
    
    public static void main(String[] args){
        // Creating the tree
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        
        System.out.println("Before mirror");
        tree.printTree(tree.root);
        
        tree.mirror();
        
        System.out.println("");
        System.out.println("After mirror");
        tree.printTree(tree.root);
    }
}
