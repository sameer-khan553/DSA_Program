package graph;

import java.util.ArrayList;

public class G2 {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    G2(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int from, int to) {
        adj.get(from).add(to);
        adj.get(to).add(from);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
         for(int node :  adj.get(i)) {
             System.out.print(node + " ");
         }
         System.out.println();
        }
    }
}
