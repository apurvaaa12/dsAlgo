package org.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://youtu.be/6dOxCMYGr-o?feature=shared
public class ThreeSum {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i< nums.length-2;i++){
         int start =  i+1;
         int end = nums.length-1;
         if(i==0 || nums[i] != nums[i-1]){
             while(start<end){
                 int current = nums[i]+nums[start]+nums[end];
                 if(current==0){
                     output.add(Arrays.asList(nums[i],nums[start],nums[end]));
                     while(start<end && nums[start] == nums[start+1]) start++;
                     while (start<end &&nums[end]==nums[end-1]) end--;
                     start++;
                     end--;
                 }else if(current> 0){
                     end--;
                 }else{
                     start++;
                 }
             }
         }
        }
        return output;
    }
}
