package org.datastructures.graphs.leetcode;

import java.util.ArrayList;
import java.util.List;

//1. FInd the shortest path using Dijkstra's a;gp
//2. Use backtracking to find the valid path
public class MaximumPathQualityOfGraph {
    public static void main(String[] args) {

        int[] values = {0, 32, 10, 43};
        int[][] edges = {{0, 1, 10}, {1, 2, 15}, {0, 3, 10}};
        int maxTime = 49;
        int quality = maximalPathQuality(values, edges, maxTime);
        System.out.println(quality);
    }

    public static int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        int n = values.length;
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int one = edge[0];
            int two = edge[1];
            int time = edge[2];
            graph.get(one).add(new int[]{two, time});
            graph.get(two).add(new int[]{one, time});
        }


        return 0;
    }
}
