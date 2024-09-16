package org.datastructures.graphs.algorithms.breadthFirstSearch;

import java.util.*;

public class BreadthFirstSearch {
    public static void main(String[] args){
        List<List<Integer>> graph = new ArrayList<>();
        int Vertex = 5, source = 1;
        int[][] edges = {{1, 2}, {1, 0}, {0, 2}, {2, 3}, {2, 4}};

        for(int i=0;i<Vertex;i++){
            graph.add(new ArrayList<>());
        }

        System.out.print(graph);

        for(int[] edge: edges){
            int src = edge[0];
            int dst = edge[1];
            graph.get(src).add(dst);
            graph.get(dst).add(src);
        }

        System.out.println();
        System.out.print(graph);

        Boolean[] visited = new Boolean[Vertex];

        Arrays.fill(visited,false);
        System.out.println();
        System.out.println(Arrays.toString(visited));
        System.out.print("Graph is: " +graph);

        bfs(graph,visited,source);
    }

    static void bfs(List<List<Integer>> graph, Boolean[] visited,int source ){
        if(visited[source] == true) return;
        visited[source]=true;

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(source);

        System.out.println();
        System.out.print("  "+ source);
        System.out.println();
        System.out.println("visited "+ Arrays.toString(visited));
        System.out.println();
        System.out.println("queue "+ queue);

        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.println("Visiting node: " +current);
            for(int i: graph.get(current)){
                if(!visited[i]==true) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
            System.out.println(Arrays.toString(visited));
            System.out.println(queue);
        }
    }
}
