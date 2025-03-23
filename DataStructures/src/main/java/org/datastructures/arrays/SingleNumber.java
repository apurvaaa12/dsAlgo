package org.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args){

        int[] nums = {4,1,2,1,2};
        int single = singleNumber(nums);
        System.out.println(single);
    }


    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current = nums[i];

            if(map.containsKey(current)){
                map.put(current,map.getOrDefault(current,0)+1);
            }else{
                map.put(current,1);
            }
        }

        System.out.println(map);

        for(Map.Entry<Integer,Integer> key: map.entrySet()){
            if(key.getValue()==1){
                return key.getKey();
            }
        }
       return -1;
    }
}
