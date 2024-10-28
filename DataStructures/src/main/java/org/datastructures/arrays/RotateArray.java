package org.datastructures.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
//        int[] nums = {-1,-100,3,99};
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));

    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int[] nums,int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}

//k=k%nums.length to handle the situation if K is greater than the nums.length
// if k>nums.length in that case we rotate the array by k%numd.length times.
// example nums.length = 5 and k= 8 then we rotate the array by 8/5 = 3 positions.