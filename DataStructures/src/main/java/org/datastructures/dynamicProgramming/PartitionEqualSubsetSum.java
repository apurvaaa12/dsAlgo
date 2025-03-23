package org.datastructures.dynamicProgramming;

import org.datastructures.arrays.InsertIntervals;

import java.util.HashMap;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5};
        boolean canPartition = canPartition(nums);
        System.out.println(canPartition);
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }

        // If the total sum is odd, it's impossible to split into two equal subsets
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        // This loop updates dp[j] to track possible subset sums, iterating backward to
        // prevent reusing numbers in the same iteration. dp[j] = dp[j] || dp[j - num]
        // ensures that if dp[j - num] was true, j can now be formed.
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }
}
