package org.datastructures.graphs.algorithms.topologicalSort;

import java.util.*;

public class TopologicalSort {

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        int Vertex = 4;
        int[][] edges = {{0, 1}, {1, 2}, {3, 1}, {3, 2}};

        for (int i = 0; i < Vertex; i++) {
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

        List<Integer> result = topologicalSort(graph, Vertex);
        System.out.println();
//        if(result.isEmpty()){
//            System.out.println("Cycle found");
//        }
        System.out.print("Sorted graph: " + result);


    }

    static List<Integer> topologicalSort(List<List<Integer>> graph, int Vertex) {
        int[] inDegree = new int[Vertex];
        List<Integer> topologicalList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        //In degree for vertex
        for (int i = 0; i < Vertex; i++) {
            for (int adj : graph.get(i)) {
                inDegree[adj]++;
            }
        }

        //Add the vertex with 0 In-degree to the queue
        for (int i = 0; i < Vertex; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        System.out.println();
        System.out.print("Queue" + queue);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            topologicalList.add(current);
            for (int adj : graph.get(current)) {
                inDegree[adj]--;
                if (inDegree[adj] == 0) queue.offer(adj);
            }
        }

        for(int i : inDegree){
            if(i!=0) System.out.println("It's a cyclic graph");
        }

        return topologicalList;
    }


}
