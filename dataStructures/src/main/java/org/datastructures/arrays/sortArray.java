package org.datastructures.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortArray {
    public static void main(String[] args){
        int[] nums = {0,1,4,2,8,0,4,2,5,2,3,1};
        int[] sortedArray = sortArray(nums);
        System.out.println("Normal sort: "+Arrays.toString(sortedArray));

        int[] sortArrayReverseOrder = reverseSort(nums,0,nums.length-1);
        System.out.println("Reverse order sorting: " + Arrays.toString(sortArrayReverseOrder));

    }

    static int[] sortArray(int[] nums){
        if(nums.length == 0) return null;

        for(int i =0;i < nums.length ; i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i]=temp;
                }
            }
        }

        return nums;

    }
    static int[] reverseSort(int[] nums,int start,int end){
        if(nums.length == 0) return null;

        while(start< end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;

    }
}
