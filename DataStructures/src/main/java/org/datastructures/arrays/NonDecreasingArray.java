package org.datastructures.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/non-decreasing-array/description/
public class NonDecreasingArray {
    public static void main(String[] args){
        int[] nums = {4,2,3};
        Boolean isNonDecreasing = checkPossibility(nums);
        System.out.println(isNonDecreasing);
    }

    public static boolean checkPossibility(int[] nums) {
        if(nums.length ==0) return false;
        int count =0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1] > nums[i]){
                count++;
                if(count>1) return false;

                if(i<2 || nums[i-2] <= nums[i]){
                    nums[i-1] = nums[i];
                }else{
                    nums[i] = nums[i-1];
                }
            }
        }

        return true;
    }
}
