package org.datastructures.dynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 1};
        int maxLength = lengthOfLIS(nums);
        System.out.println(maxLength);
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int maxLength = 1;
        int[] dpArray = new int[nums.length + 1];
        Arrays.fill(dpArray, 1);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dpArray[i] = Math.max(dpArray[i], 1 + dpArray[j]);
                    maxLength = Math.max(maxLength, dpArray[i]);
                }
            }
        }
        System.out.println(set);
        return maxLength;
    }
}
