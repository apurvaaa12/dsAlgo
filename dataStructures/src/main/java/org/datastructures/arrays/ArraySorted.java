package org.datastructures.arrays;

public class ArraySorted {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        boolean answer = check(nums);
        System.out.println(answer);

    }

    public static boolean check(int[] nums) {
        int count = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] > nums[(i + 1) % length]) {
                System.out.println(nums[(i + 1) % length]);
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}
