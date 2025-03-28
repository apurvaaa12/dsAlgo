package org.datastructures.dynamicProgramming;


//https://www.youtube.com/watch?v=tBKFwlqNUY4
public class MinCostForTickets {
    public static void main(String[] args) {
        int[] days = {1, 4, 6, 7, 8, 20}, costs = {2, 7, 15};
        int output = mincostTickets(days, costs);
        System.out.println(output);
    }

    public static int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length];
        return minCost(days, costs, 0, 0, dp);
    }

    public static int minCost(int[] days, int[] costs, int index, int lastPassGoodUntil, int[] dp) {
        if (index >= days.length) return 0;
        if (days[index] <= lastPassGoodUntil) {
            return minCost(days, costs, index + 1, lastPassGoodUntil, dp);
        }
        if (dp[index] != 0) {
            return dp[index];
        }
        int minCost = Math.min(costs[0] + minCost(days, costs, index + 1, days[index], dp),
                Math.min(costs[1] + minCost(days, costs, index + 1, days[index] + 6, dp),
                        costs[2] + minCost(days, costs, index + 1, days[index] + 29, dp)));

                dp[index] = minCost;

                return minCost;
    }

}
