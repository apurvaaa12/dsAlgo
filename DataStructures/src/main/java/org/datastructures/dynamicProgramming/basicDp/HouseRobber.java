package org.datastructures.dynamicProgramming.basicDp;

//https://www.youtube.com/watch?v=ZwDDLAeeBM0
public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int output = rob(nums);
        System.out.println(output);
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int first = nums[0];
        int second = 0;

        for (int i = 1; i < nums.length; i++) {
            int sum = second + nums[i];
            second = Math.max(first, second);
            first = sum;
        }

        return Math.max(first, second);
    }
}


//        if (nums.length == 0) return 0;
//        int[] dpArray = new int[nums.length + 1];
//        int maxProfit = 0;
//
//        for(int i =0;i< nums.length;i+=2){
//            maxProfit = Math.max(maxProfit,nums[i]+maxProfit);
////        Arrays.fill(dpArray, 1);
//////        for (int i = 2; i < nums.length - 1; i++) {
////            dpArray[i] = dpArray[i] + dpArray[i + 2];
////            maxProfit = Math.max(dpArray[i], maxProfit);
//
//        }
//        return maxProfit;
//    }