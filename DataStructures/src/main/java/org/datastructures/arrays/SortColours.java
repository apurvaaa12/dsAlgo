package org.datastructures.arrays;

import java.util.Arrays;

//https://youtu.be/uvB-Ns_TVis?feature=shared
public class SortColours {
    //0 Red 1 White 2 Blue
    public static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
       int start =0;
       int end = nums.length-1;
       int index =0;
       while(index <= end && start < end){
           if(nums[index]==0){
               nums[index] = nums[start];
               nums[start] =0;
               start++;
               index++;
           }else if(nums[index]==2){
               nums[index]=nums[end];
               nums[end]=2;
               end--;
           }else{
               index++;
           }
       }
    }
}
