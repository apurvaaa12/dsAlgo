package org.datastructures.arrays;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] frequentElements = topKFrequent(nums, k);
        System.out.println(Arrays.toString(frequentElements));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            if (map.containsKey(current)) {
                map.put(current, map.getOrDefault(current, 0) + 1);
            } else {
                map.put(current, 1);
            }
        }

        System.out.println(map);

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            priorityQueue.offer(key);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        int[] result = new int[k];
        int index =0;
        while(!priorityQueue.isEmpty()){
            result[index++] = priorityQueue.poll().getKey();
        }

        return result;
    }
}
