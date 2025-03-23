package org.datastructures.dynamicProgramming.basicDp;

public class HouseRobberII {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        int output = rob(nums);
        System.out.println(output);
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        return Math.max(robHelper(nums, 0, nums.length - 2),//exclude last house
                robHelper(nums, 1, nums.length - 1)); //exclude first house
    }

    public static int robHelper(int[] nums, int start, int end) {
        int first = 0, second = 0;
        for (int i = start; i <= end; i++) {
            int sum = second + nums[i];
            second = Math.max(first, second);
            first = sum;
        }

        return Math.max(first, second);
    }
}
