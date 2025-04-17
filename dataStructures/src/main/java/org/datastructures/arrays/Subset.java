package org.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> output = subsets(nums);
        System.out.println(output);
    }
    public static List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
       recursiveSolution(nums,0,new ArrayList<>(),result);
       return result;
    }

    public static void recursiveSolution(int[] nums, int index,List<Integer> current,List<List<Integer>> result) {
     if(index == nums.length){
         result.add(new ArrayList<>(current));
         return;
     }

     current.add(nums[index]);
     recursiveSolution(nums,index+1,current,result);

     current.removeLast();
     recursiveSolution(nums,index+1,current,result);
    }
}
