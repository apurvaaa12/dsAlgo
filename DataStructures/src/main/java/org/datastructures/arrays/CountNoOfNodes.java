package org.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountNoOfNodes {
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{1, 2}, {2, 4}, {1, 3}, {2, 3}, {2, 1}};
        int[] queries = {2, 3};
        int[] outputMatrix = countPairs(n, edges, queries);
        System.out.println(Arrays.toString(outputMatrix));
    }

    public static int[] countPairs(int n, int[][] edges, int[] queries) {
        int[] result = new int[queries.length];
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        System.out.print(graph);

        for (int[] edge : edges) {
            int src = edge[0];
            int dst = edge[1];
            graph.get(src).add(dst);
        }
        System.out.println();
        System.out.print("Graph is: " + graph);


        return result;
    }
}
