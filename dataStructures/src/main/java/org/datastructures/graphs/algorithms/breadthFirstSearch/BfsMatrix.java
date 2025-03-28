package org.datastructures.graphs.algorithms.breadthFirstSearch;

import java.util.*;

public class BfsMatrix {
    public static void main(String[] args){
        int[][] graph = new int[0][0];
        int v = 5, source = 1;
        int[][] edges = {{1, 2}, {1, 0}, {0, 2}, {2, 3}, {2, 4}};
        List<Integer> nodes = new ArrayList<>();
        graph = new int[v][v];

        for(int i=0;i<v;i++){
            nodes.add(i);
        }

        System.out.println(nodes);

        for(int[] edge : edges){
            int one = edge[0];
            int two = edge[1];
            graph[one][two]=1;
            graph[two][one]=1;
        }

        System.out.print("  ");
        for(int node: nodes){
            System.out.print(node+"  ");
        }
        System.out.println();

        for(int i=0;i< graph.length;i++){
            System.out.print(nodes.get(i) +""+Arrays.toString(graph[i]));
            System.out.println();
        }


        Boolean[] visited = new Boolean[v];
        Arrays.fill(visited,false);
        System.out.println("Visited: " +Arrays.toString(visited));
        bfs(graph,visited,source);
    }

    static void bfs(int[][] graph,Boolean[] visited, int source){
        visited[source] =true;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        System.out.println();
        System.out.print("  "+ source);
        System.out.println();
        System.out.println("visited "+ Arrays.toString(visited));
        System.out.println();
        System.out.println("queue "+ queue);

        while (!queue.isEmpty()){
            int current = queue.poll();
            for(int i=0;i<graph[current].length;i++){
                if(!visited[i] && graph[current][i]==1){
                    visited[i] =true;
                    queue.offer(i);
                }
            }
            System.out.println(Arrays.toString(visited));
            System.out.println(queue);
        }


    }
}
