package org.datastructures.arrays;

public class RemoveElementToMakeItIncreasing {
    public static void main(String[] args) {
        int[] nums = {1, 2, 10, 5, 7};
        boolean isIncreasing = canBeIncreasing(nums);
        System.out.println(isIncreasing);
    }

    public static boolean canBeIncreasing(int[] nums) {
        int count = 0, index = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                count++;
                index = i;
            }
        }

        if (count == 0) return true;
        if (count > 1) return false;

        if (index == 1 || index == nums.length - 1) return true;


        return nums[index - 2] < nums[index] || nums[index - 1] < nums[index + 1];
    }
}
