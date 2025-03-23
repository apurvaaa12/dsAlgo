package org.datastructures.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MaxProfitJobScheduling {
    public static void main(String[] args) {
        int[] startTime = {1, 2, 3, 4, 6};
        int[] endTime = {3, 5, 10, 6, 9};
        int[] profit = {20, 20, 100, 70, 60};
        int maxProfit = jobScheduling(startTime, endTime, profit);
        System.out.println(maxProfit);
    }

    private static class Job {
        int endTime;
        int startTime;
        int profit;

        public Job(int endTime, int startTime, int profit) {
            this.endTime = endTime;
            this.startTime = startTime;
            this.profit = profit;
        }
    }

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int numJob = profit.length;

        Job[] jobs = new Job[numJob];

        for (int i = 0; i < numJob; i++) {
            jobs[i] = new Job(endTime[i], startTime[i], profit[i]);
        }

        Arrays.sort(jobs, Comparator.comparingInt(job -> job.endTime));

        int[] dpArray = new int[numJob + 1];

        for (int i = 0; i < numJob; i++) {
            int endTimeValue = jobs[i].endTime;
            int startTimeValue = jobs[i].startTime;
            int profitValue = jobs[i].profit;

            int latestNonConflictingIndex = upperbound(jobs, i, startTimeValue);
            dpArray[i + 1] = Math.max(dpArray[i], dpArray[latestNonConflictingIndex] + profitValue);
        }


        return dpArray[numJob];
    }

    public static int upperbound(Job[] jobs, int endIndex, int target) {
        int low = 0;
        int high = endIndex;

        while (low < high) {
            int mid = (low + high) / 2;

            if (jobs[mid].endTime <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}

