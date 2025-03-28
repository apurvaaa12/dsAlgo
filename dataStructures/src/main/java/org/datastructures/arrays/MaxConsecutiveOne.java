package org.datastructures.arrays;


//https://www.youtube.com/watch?v=PLa4tYQhqoU
public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int nums[] = {1, 0, 1, 1, 0, 1};
        int count = findMaxConsecutiveOnes(nums);
        System.out.println(count);

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1) {
                count = count + 1;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        System.out.println(max);
        return max;
    }
}
