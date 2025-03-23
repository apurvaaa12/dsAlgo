package org.datastructures.arrays;

import java.util.*;

public class KthSmallestElementInaMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        int smallestElement = kthSmallest(matrix,k);
        System.out.println(smallestElement);
        int priorityQueue = kthSmallestPriorityQueue(matrix,k);
        System.out.println(priorityQueue);
    }

    public static int kthSmallest(int[][] matrix, int k) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                list.add(matrix[i][j]);
            }
        }

        Collections.sort(list);
        return list.get(k-1);
    }

    public static int kthSmallestPriorityQueue(int[][] matrix, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                minHeap.offer(matrix[i][j]); // Add elements to min-heap
            }
        }

        // Extract k times to get the k-th smallest element
        int result = 0;
        for (int i = 0; i < k; i++) {
            result = minHeap.poll();
        }

        return result;
    }
}
