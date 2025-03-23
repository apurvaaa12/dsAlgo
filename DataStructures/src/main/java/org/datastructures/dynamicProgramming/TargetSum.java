package org.datastructures.dynamicProgramming;

public class TargetSum {
    public static void main(String[] args){
        int[] nums = {1,1,1,1,1};
        int target = 3;
        int targetSum = findTargetSumWays(nums,target);
        System.out.println(targetSum);
    }
    public static int findTargetSumWays(int[] nums, int target) {
        int length = nums.length;
        int[] dpArray = new int[length+1];

        dpArray[0] = 1;

        for(int num:nums){
            for(int i = num;i<=target;i++){
                dpArray[i] = dpArray[i]+dpArray[i-num];
            }
        }

        return dpArray[length];
    }
}
