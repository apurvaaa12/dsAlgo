package org.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int majorityElement = majorityElement(nums);
        System.out.println(majorityElement);

    }

//    public static int majorityElement(int[] nums) {
//        if (nums.length == 1) return nums[0];
//        //Every Element is considered a one team
//        //first element is the majority element
//        int majorElement = nums[0];
//        //Team size is one.
//        int teamSize = 1;
//
//        //Traverse through the array if we find the number is the same as the majority element
//        // we increment the count or the team Size
//        //If you encounter a new element that's not a majority element reduce the team size by 1
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == majorElement) {
//                teamSize++;
//            } else {
//                teamSize--;
//            }
//            if (teamSize == 0) {
//                majorElement = nums[i];
//                teamSize = 1;
//            }
//        }
//
//        return majorElement;
//    }
//}



    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }else{
                map.put(nums[i],1);
            }

        }

        System.out.println(map);
        for(Map.Entry<Integer,Integer> key : map.entrySet()){
            if(key.getValue()>n/2){
                max = Math.max(max,key.getKey());
            }
        }
        return max;
    }
}


//  if(nums.length==0) return 0;
//        if(nums.length==1) return nums[0];
//
//Map<Integer,Integer> map = new HashMap<>();
//        for(int num:nums){
//        if(map.containsKey(num) && map.get(num)+1 > nums.length/2){
//        return num;
//            }else{
//                    map.put(num,map.getOrDefault(num,0)+1);
//        }
//        }
//        return -1;
