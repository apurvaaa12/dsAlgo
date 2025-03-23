package org.datastructures.random;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomII {
    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        int minRooms = minMeetingRooms(intervals);
        System.out.println(minRooms);
    }

    public static int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (int[] arr : intervals) {
            if (minHeap.isEmpty()) {
                minHeap.offer(arr);
            } else {
                if (minHeap.peek()[1] <= arr[0]) {
                    minHeap.poll();
                }
                minHeap.offer(arr);
            }
        }
        return minHeap.size();
    }
}
