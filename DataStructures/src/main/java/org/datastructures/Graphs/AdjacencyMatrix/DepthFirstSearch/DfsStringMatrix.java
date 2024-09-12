package org.datastructures.Graphs.AdjacencyMatrix.DepthFirstSearch;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DfsStringMatrix {

    public static void main(String[] args) {
        String[][] graph ;
        ArrayList<String> nodes = new ArrayList<>();
        String[] vertex = {"A", "B", "C", "D", "E"};
        String[][] edges = {{"A", "B"}, {"A", "D"}, {"A", "C"}, {"B", "C"}, {"C", "D"}, {"C", "E"}};
        String source = "C";
        graph = new String[vertex.length][vertex.length];

        for (int i = 0; i < vertex.length; i++) {
            for (int j = 0; j < vertex.length; j++) {
                graph[i][j] = "0";
            }
        }

        for(int i =0 ;i<vertex.length;i++){
            nodes.add(vertex[i]);
        }

        for(String[] edge: edges){
            int first = nodes.indexOf(edge[0]);
            int second = nodes.indexOf(edge[1]);
            graph[first][second]="1";
            graph[second][first]="1";
        }

        System.out.print("   ");
        for(String node: nodes){
            System.out.print(node + "  ");
        }
        System.out.println();

        for(int i=0;i< graph.length;i++){
            System.out.print(nodes.get(i) + " " + Arrays.toString(graph[i]));
            System.out.println();
        }

        dfs(graph,source,nodes);
    }

     static void dfs(String[][] graph,String source,ArrayList<String> nodes){
        Set<String> visited = new HashSet<>();
        System.out.println("visited: " + visited);
        dfsHelper(graph,visited,source,nodes);
    }

    static void dfsHelper(String[][] graph, Set<String> visited, String source,ArrayList<String> nodes){
        visited.add(source);
        System.out.println("Visited: " + source);

        int sourceIndex = nodes.indexOf(source);
        for(int i = 0; i < graph[sourceIndex].length;i++){
            if(graph[sourceIndex][i].equals("1")){
                String adjNode = nodes.get(i);
                if(!visited.contains(adjNode)){
                    dfsHelper(graph,visited,adjNode,nodes);
                }
            }
        }
    }

}
