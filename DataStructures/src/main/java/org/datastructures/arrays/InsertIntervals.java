package org.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] insert = insert(intervals, newInterval);

        for (int i = 0; i < insert.length; i++) {
            System.out.println(Arrays.toString(insert[i]));
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        //loop through every slot in the intervals
        for (int[] slot : intervals) {
            int start = slot[0];
            int end = slot[1];
            // if newInterval before slot insert newInterval & update slot as new interval
            if (newInterval[1] < start) {
                result.add(newInterval);
                newInterval = slot;
                // if slot is lesser than new Interval insert slot
            } else if (newInterval[0] > end) {
                result.add(slot);
            } else {
                newInterval[0] = Math.min(newInterval[0], start);
                newInterval[1] = Math.max(newInterval[1], end);
            }
        }

        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}

