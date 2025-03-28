package org.datastructures.arrays;


import java.util.Arrays;
import java.util.HashSet;

//https://leetcode.com/problems/remove-du̵plicates-from-sorted-array/description/?envType=problem-list-v2&envId=array&difficulty=EASY
public class DuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] numberOfElements = removeDuplicates(nums);
        System.out.println(Arrays.toString(numberOfElements));
    }

//    public static int removeDuplicates(int[] nums) {
//        if(nums == null) return 0;
//
//        HashSet<Integer> set = new HashSet<>();
//        for(int i =0 ;i<nums.length;i++){
//            set.add(nums[i]);
//            System.out.println(set);
//        }
//
//        return set.size();
//    }

    public static int[] removeDuplicates(int[] nums) {
        int index= 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[index++] = nums[i+1];
            }
        }
        return Arrays.copyOfRange(nums,0,index);
    }
}
