package org.datastructures.searchingalgos;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 1;
        boolean answer = linearSearch(nums, target);
        System.out.println(answer);
    }

    public static boolean linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }

        return false;
    }
}
