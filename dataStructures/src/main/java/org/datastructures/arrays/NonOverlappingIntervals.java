package org.datastructures.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int remove = eraseOverlapIntervals(intervals);
        System.out.println(remove);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        int length = intervals.length;
        //sort the intervals based on end time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int previous = 0;
        int current = 1;
        for (int i = 0; i < length; i++) {
            if (intervals[i][0] >= intervals[previous][1]) {
                previous = i;
                current++;
            }
        }
        return length - current;
    }
}
