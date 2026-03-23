package graph;

import java.util.ArrayList;

 class Graph1 {


    private final int V; // number of vertices
    private final ArrayList<ArrayList<Integer>> adj;

    // Constructor
    Graph1(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add Edge (Undirected)
    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // Print Graph
    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
