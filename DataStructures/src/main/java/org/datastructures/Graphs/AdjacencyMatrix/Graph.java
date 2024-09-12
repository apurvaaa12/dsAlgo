package org.datastructures.Graphs.AdjacencyMatrix;

import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        nodes= new ArrayList<>();
        matrix = new int[size][size];
    }


    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int source, int destination){
        matrix[source][destination]=1;
    }

    public Boolean checkEdge(int source,int destination){
        if(matrix[source][destination]==1) return true;
        return false;
    }

    public void print(){
        System.out.print("  ");
        for(Node node: nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i=0; i< matrix.length;i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }


    /***
     *
     * we're just passing the source inside the method to know where to begin with.
     */
    public void depthFirstSearch(int source){
        //Create an array of booleans and the size is equal to the length of the matrix
        boolean[] visited = new boolean[matrix.length];
        //helper method where we're passing the source and visited.
        dfsHelper(source,visited);
    }

    private void dfsHelper(int source, boolean[] visited) {
        //if our visited array at index of source is equal to true then we simply return
        //Else we're setting the visited array to true.
        if(visited[source]) return;
        else visited[source] = true;
        System.out.println(nodes.get(source).data + " = Visited ");
        //picking one row of a matrix
        for(int i = 0; i<matrix[source].length;i++){
            //source is the row that we're working with and I is the column
            //if it's equal to 1 we will invoke the dfs method again
            if(matrix[source][i]==1) dfsHelper(i,visited);
            //if we successfully iterate through the entire row we simply return.
        }
        return;
    }
}
