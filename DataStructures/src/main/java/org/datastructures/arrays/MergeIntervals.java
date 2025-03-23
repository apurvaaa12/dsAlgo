package org.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args){
        int[][] intervals  = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merge = merge(intervals);
        for(int i=0;i< merge.length;i++){
            System.out.println(Arrays.toString(merge[i]));
        }
    }
    public static int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;

        // Step 1: Sort intervals based on the start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];

        // Step 2: Merge overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            if (current[1] >= intervals[i][0]){ //found and overlap
                current[1] = Math.max(current[1],intervals[i][1]);
            }else{
                merged.add(current);
                current = intervals[i];
            }
        }

        merged.add(current); // Add the last interval

        // Step 3: Convert the list to array
        return merged.toArray(new int[merged.size()][]);
    }
}
