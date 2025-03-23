package org.datastructures.arrays;

import java.util.Arrays;


//https://www.youtube.com/watch?v=SQeHgKrAWMk
// First find the sum of all the numbers in an array
// By math sum of number = n(n+1)/2
// Compare the obtained sum with the formula value
// The difference is the missing number

public class FindMissingNumberInAnArray {
    public static void main(String[] args) {
        int nums[] = {9,6,4,2,3,5,7,0,1};
        int missingNumber = missingNumber(nums);
        System.out.println(missingNumber);
    }


    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int totalsum = n*(n+1)/2;
        System.out.println("Total Sum "+ totalsum);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }

        System.out.println("Sum: " +sum);

        return totalsum-sum;
    }
}
