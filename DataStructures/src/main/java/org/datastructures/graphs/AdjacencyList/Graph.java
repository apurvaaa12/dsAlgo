package org.datastructures.graphs.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    ArrayList<LinkedList<Node>> aList;

    public Graph() {
        this.aList = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        aList.add(currentList);
    }

    public void addEdge(int source, int destination) {
        LinkedList<Node> currentList = aList.get(source);
        Node destNode = aList.get(destination).get(0);
        currentList.add(destNode);
    }

    public boolean checkEdge(int source, int destination) {
        LinkedList<Node> currentList = aList.get(source);
        Node destNode = aList.get(destination).get(0);
        for(Node node: currentList){
            if(node == destNode) return true;
        }
        return false;
    }

    public void print() {
        for(LinkedList<Node> currentList : aList){
            for(Node nodes : currentList){
                System.out.print(nodes.data + " -> ");
            }
            System.out.println();
        }
    }
}
