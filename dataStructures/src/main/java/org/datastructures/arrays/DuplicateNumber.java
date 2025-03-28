package org.datastructures.arrays;

import java.util.Arrays;

//https://youtu.be/4dCQ0B_9x-4?feature=shared
//linkedlist cycle algorithm
//Floyd algorithm
//slow pointer
//fast pointer
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);

    }

    public static int findDuplicate(int[] nums) {
        //Take two pointers
        //One moves quickly
        //One moves slowly
        int slow = nums[0];
        int fast = nums[0];
        do{
            //Moves one step
            slow = nums[slow];
            //moves two steps
            fast =nums[nums[fast]];
        }while(slow!= fast);

            fast = nums[0];
            while(slow!=fast){
                slow = nums[slow];
                fast = nums[fast];
            }


        return slow;
    }
}
