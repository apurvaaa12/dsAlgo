package org.datastructures.graphs.algorithms.depthFirstSearch;


import java.util.ArrayList;
import java.util.Arrays;

public class DepthFirstSearch {

    public static void main(String[] args) {
        int[][] graph;
        int V = 5, source = 1;
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {2, 4}};

        graph = new int[V][V];
        ArrayList<Integer> nodes = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            nodes.add(i);
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        System.out.print("   ");
        for (Integer node : nodes) {
            System.out.print(node + "  ");
        }
        System.out.println();

        for (int i = 0; i < graph.length; i++) {
            System.out.print(nodes.get(i) + " " + Arrays.toString(graph[i]));
            System.out.println();
        }

        dfs(graph, source);

    }

    private static void dfs(int[][] graph, int source) {
        boolean[] visited = new boolean[graph.length];
        System.out.println();
        System.out.println("Visited " + Arrays.toString(visited));
        dfsHelper(graph, visited, source);
    }

    private static void dfsHelper(int[][] graph, boolean[] visited, int source) {
        visited[source] = true;

        System.out.print(source);
        System.out.println(" visited " + Arrays.toString(visited));

        for(int i = 0; i<graph[source].length;i++){

            if(graph[source][i]==1 && !visited[i]){
                dfsHelper(graph,visited,i);
            }

        }

    }


}
