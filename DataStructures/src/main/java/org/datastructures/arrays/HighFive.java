package org.datastructures.arrays;

import java.util.*;

public class HighFive {
    public static void main(String[] args) {
        int[][] items = {{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}};
        int[][] result = highFive(items);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public static int[][] highFive(int[][] items) {
        // Map to store student ID and a min-heap of their scores
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        // Process each score
        for (int[] item : items) {
            int id = item[0], score = item[1];
            map.putIfAbsent(id, new PriorityQueue<>()); // Min-heap to track top 5 scores
            PriorityQueue<Integer> pq = map.get(id);

            pq.offer(score); // Add score
            if (pq.size() > 5) pq.poll(); // Remove the lowest if more than 5 scores
        }

        // Sort student IDs
        List<Integer> sortedIds = new ArrayList<>(map.keySet());
        Collections.sort(sortedIds); // Ensure result is sorted by ID

        // Prepare result array
        int[][] result = new int[sortedIds.size()][2]; // Ensure correct size
        int index = 0;

        // Process each student's top 5 scores
        for (int id : sortedIds) {
            PriorityQueue<Integer> pq = map.get(id);
            int sum = 0;

            while (!pq.isEmpty()) {
                sum = sum + pq.poll(); // Sum top 5 scores
            }

            result[index] = new int[]{id, sum / 5}; // Compute integer division
            index++; // Increment after assignment
        }
        return result;
    }
}