package com.mycompany.java.fundamentals.datastructures.graph.codingproblems.level1;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Depth First Search or DFS for a Graph Depth First Traversal (or Search) for a
 * graph is similar to Depth First Traversal of a tree. The only catch here is,
 * that, unlike trees, graphs may contain cycles (a node may be visited twice).
 * To avoid processing a node more than once, use a boolean visited array. A
 * graph can have more than one DFS traversal.
 *
 *
 * Input: n = 4, e = 6 0 -> 1, 0 -> 2, 1 -> 2, 2 -> 0, 2 -> 3, 3 -> 3 Output:
 * DFS from vertex 1 : 1 2 0 3
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
// This class represents a
// directed graph using adjacency
// list representation
public class Problem3 {

    private int V; // No. of vertices

    // Array  of lists for
    // Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    Problem3(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    void DFSUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    // The function to do DFS traversal.
    // It uses recursive
    // DFSUtil()
    void DFS(int v) {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited);
    }

    /**
     * Driver's Code
     */
    public static void main(String[] args) {

        Problem3 g = new Problem3(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                + "(starting from vertex 2)");

        // Function call
        g.DFS(2);
    }
}
// This code is contributed by Aakash Hasija
