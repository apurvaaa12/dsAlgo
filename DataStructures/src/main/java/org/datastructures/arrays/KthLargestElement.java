package org.datastructures.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

//https://www.youtube.com/watch?v=FrWq2rznPLQ
public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int kthLargest = findKthLargest(nums, k);
        System.out.println(kthLargest);
    }

    public static int findKthLargest(int[] nums, int k) {
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        return nums[nums.length - k];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i: nums){
            minHeap.offer(i);
            System.out.println("MinHeap: " +minHeap );
            if(minHeap.size()>k){
                minHeap.remove();
                System.out.println(minHeap);
            }
        }
        return minHeap.remove();
    }
}
