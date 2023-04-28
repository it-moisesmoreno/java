package com.mycompany.java.fundamentals.datastructures.graph.codingproblems.level1.problem1;

/*
	Given the adjacency list and number of vertices and edges of a graph, 
	the task is to represent the adjacency list for a directed graph.
	
	Input: V = 3, edges[][]= {{0, 1}, {1, 2} {2, 0}}
 */
// Java program for the above approach
import java.util.*;

class GFG {

    // Function to add edges
    static void addEdge(Vector<Integer> adj[], int u, int v) {
        adj[u].add(v);
        //System.out.println("addEdge - adj: " + adj[u]);
    }

    // Function to print adjacency list
    static void adjacencylist(Vector<Integer> adj[], int V) {
        for (int i = 0; i < V; i++) {
            System.out.print(i + "->");
            for (int x : adj[i]) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    // Function to initialize the adjancency list
    // of the given graph
    static void initGraph(int V, int edges[][], int noOfEdges) {

        // To represent graph as adjacency list
        @SuppressWarnings("unchecked")
        Vector<Integer> adj[] = new Vector[noOfEdges];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Vector<>();
        }
        // Traverse edges array and make edges
        for (int i = 0; i < noOfEdges; i++) {

            // Function call to make an edge
            addEdge(adj, edges[i][0], edges[i][1]);
            //System.out.println("edges[" + i + "][0], edges[" + i +"][1]: " + edges[i][0] + "," + edges[i][1]);
        }

        // Function Call to print adjacency list
        adjacencylist(adj, V);
    }

    // Driver Code
    public static void main(String[] args) {

        // Example 1
        {
            System.out.println("Example 1");

            // Given vertices 
            int V = 3;

            // Given edges
            int edges[][] = {{0, 1}, {1, 2}, {2, 0}};
            /*for(int[] i: edges){
                            for(int j: i)
                                    System.out.print(j + " ");
                            System.out.print(", ");
                    }*/
            //System.out.println(edges[0][1]);

            int noOfEdges = 3;

            // Function Call
            initGraph(V, edges, noOfEdges);
        }

        // Example 2
        {
            System.out.println("Example 2");

            // Given vertices 
            int V = 4;

            // Given edges
            int edges[][] = {{0, 1}, {1, 2}, {1, 3}, {2, 3}, {3, 0}};

            int noOfEdges = 5;

            // Function Call
            initGraph(V, edges, noOfEdges);
        }
    }
}

// This code is contributed by gauravrajput1
