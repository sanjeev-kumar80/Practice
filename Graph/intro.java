package Graph;

import java.util.*;


public class intro {
    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Create empty list for every vertex
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (Undirected Graph)
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(1).add(3);
        graph.get(3).add(1);

        // Print graph
        for (int i = 0; i < vertices; i++) {

            System.out.print(i + " -> ");

            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
    }
}




