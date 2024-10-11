package org.datastructures.arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int equilibriumIndex = equilibriumIndex(nums);
        System.out.println(equilibriumIndex);
    }

    static int equilibriumIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum + nums[i];
            System.out.println("Total Sum:" + totalSum);
        }
        for(int i =0; i<nums.length;i++){
            if(i!=0){
                leftSum = leftSum+nums[i-1];
            }
            System.out.println("Left sum: " +leftSum);
            if(totalSum-leftSum-nums[i] == leftSum){
                return i;
            }
        }

        return -1;
    }
}
