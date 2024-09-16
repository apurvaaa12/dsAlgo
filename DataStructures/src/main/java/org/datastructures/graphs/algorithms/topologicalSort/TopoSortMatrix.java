package org.datastructures.graphs.algorithms.topologicalSort;

import java.util.*;

public class TopoSortMatrix {

    static List<String> nodes = new ArrayList<>();

    public static void main(String[] args) {
        String[][] graph;
        String[] vertex = {"A", "B", "C", "D", "E"};
        String[][] edges = {{"A", "B"}, {"A", "C"}, {"B", "D"},{"C","D"}, {"E", "C"}, {"E", "D"}};
        graph = new String[vertex.length][vertex.length];

        for (int i = 0; i < vertex.length; i++) {
            Arrays.fill(graph[i], "0");
        }

        for (int i = 0; i < vertex.length; i++) {
            nodes.add(vertex[i]);
        }
        System.out.println(nodes);

        for (String[] edge : edges) {
            int one = nodes.indexOf(edge[0]);
            int two = nodes.indexOf(edge[1]);
            graph[one][two] = "1";
        }

        System.out.print("  ");
        for (String node : nodes) {
            System.out.print(node + "  ");
        }

        for (int i = 0; i < graph.length; i++) {
            System.out.println();
            System.out.print(nodes.get(i) + "" + Arrays.toString(graph[i]));
        }

        List<String> result = topologicalSort(graph, vertex);
        if (result.isEmpty() || result == null) System.out.println("Graph has a cycle");
        else System.out.println("Sorted Graph: " + result);
    }

    static List<String> topologicalSort(String[][] graph,String[] vertex){

        int[] indegree = new int[vertex.length];
        List<String> orderedList = new ArrayList<>();;
        Queue<String> queue = new LinkedList<>();

        for(int i=0;i< vertex.length;i++){
          for(int j=0;j< vertex.length;j++){
              if(graph[j][i].equals("1")) indegree[i]++;
          }
        }

        System.out.println("\nIn degree: " + Arrays.toString(indegree));

        for(int i=0;i< vertex.length;i++){
            if(indegree[i]==0) queue.offer(vertex[i]);
        }

        System.out.println(queue);

        // Process the queue for topological sorting
        while (!queue.isEmpty()) {
            String current = queue.poll();
            orderedList.add(current);
            int currentIndex = nodes.indexOf(current);

            for (int i = 0; i < graph[currentIndex].length; i++) {
                if (graph[currentIndex][i].equals("1")) {
                    indegree[i]--;
                    if (indegree[i] == 0) {
                        queue.offer(vertex[i]);
                    }
                }
            }
        }

        return orderedList;
    }
}
