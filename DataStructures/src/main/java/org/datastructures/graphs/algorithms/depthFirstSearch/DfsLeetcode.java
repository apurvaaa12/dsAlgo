package org.datastructures.graphs.algorithms.depthFirstSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class DfsLeetcode {
    public static void main(String[] args){
       int n = 3, source = 0, destination = 2;
       int[][] edges = {{0,1},{1,2},{2,0}};
       int[][] graph = new int[n][n];
        ArrayList<Integer> nodes= new ArrayList<>();

        for(int i=0;i<n;i++){
            nodes.add(i);
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        System.out.print("   ");
        for(int node: nodes){
            System.out.print(node +"  ");
        }
        System.out.println();

        for(int i =0;i< graph.length;i++){
            System.out.print(nodes.get(i)+" "+Arrays.toString(graph[i]));
            System.out.println();
        }
        Boolean[] visited = new Boolean[n];
        Arrays.fill(visited, false);
        Boolean result = dfsHelper(graph,visited,source,destination);
        System.out.println(result);

    }

    static Boolean dfsHelper(int[][] graph,Boolean[] visited, int src, int dst){
        if(src==dst) return true;

        visited[src] =true;

        for (int i = 0; i < graph[src].length; i++) {
            if (graph[src][i] == 1 && !visited[i]) {
                if (dfsHelper(graph, visited, i, dst)) {
                    return true;
                }
            }
        }
        return false;
    }
}
