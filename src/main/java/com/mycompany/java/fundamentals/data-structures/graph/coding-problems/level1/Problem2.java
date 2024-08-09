package com.mycompany.java.fundamentals.datastructures.graph.codingproblems.level1;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Breadth First Search or BFS for a Graph
 *
 * The breadth-first search (BFS) algorithm is used to search a tree or graph
 * data structure for a node that meets a set of criteria. It starts at the
 * tree’s root or graph and searches/visits all nodes at the current depth level
 * before moving on to the nodes at the next depth level. Breadth-first search
 * can be used to solve many problems in graph theory.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Problem2 {

    // No. of vertices
    private int V;

    // Adjancency Lists
    private LinkedList<Integer> adj[];

    // Constructor
    Problem2(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the currrent node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjadcent vertices of the dequeued
            // vertex s If an adjacent has not been visited,
            // then mark it visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    /**
     * Driver code
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Problem2 g = new Problem2(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "
                + "(starting from vertex 2)");

        g.BFS(2);
    }

}
