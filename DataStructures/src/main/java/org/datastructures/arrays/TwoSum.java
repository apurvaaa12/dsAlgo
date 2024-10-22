package org.datastructures.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) { // 1
            for (int j = i; j < nums.length; j++) { // 1
                if (target == nums[j] + nums[j - i]) { // 1 + 0 = target
                    return new int[]{j, j-i}; // return 1,0
                }
            }
        }
        return null;
    }
}
