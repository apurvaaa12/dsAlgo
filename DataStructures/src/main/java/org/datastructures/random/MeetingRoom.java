package org.datastructures.random;

import java.util.Arrays;

public class MeetingRoom {
    public static void main(String[] args){
        int[][] intervals = {{0,30},{5,10},{15,20}};
        boolean canAttend = canAttendMeetings(intervals);
        System.out.println(canAttend);

    }
    public static boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null)
            return false;
        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i-1][1]>intervals[i][0]){
                return false;
            }
        }
        return true;
    }
}
