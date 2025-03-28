package org.datastructures.dynamicProgramming;

public class MostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        int output = minCostClimbingStairs(cost);
        System.out.println(output);
    }

    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length <= 1) return 0;

        int previous2 = cost[0];
        int previous = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int current = cost[i] + Math.min(previous, previous2);
            previous2 = previous;
            previous = current;
        }

        return Math.min(previous, previous2);
    }

}
