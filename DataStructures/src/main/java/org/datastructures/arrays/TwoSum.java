package org.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;

//https://youtu.be/Aql6zHkONek?feature=shared
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    //    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 1; i < nums.length; i++) { // 1
//            for (int j = i; j < nums.length; j++) { // 1
//                if (target == nums[j] + nums[j - i]) { // 1 + 0 = target
//                    return new int[]{j, j-i}; // return 1,0
//                }
//            }
//        }
//        return null;
//    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference = target -nums[i];
            if(map.containsKey(difference)){
                result[0]=i;
                result[1]=map.get(difference);
                return result;
            }
            map.put(nums[i],i);
        }

        return result;

    }
}
