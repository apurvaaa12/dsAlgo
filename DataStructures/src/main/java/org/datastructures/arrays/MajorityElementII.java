package org.datastructures.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        List<Integer> majorityElement = majorityElement(nums);
        System.out.println(majorityElement);

    }

    public static List<Integer> majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.containsKey(current)) {
                map.put(current, map.getOrDefault(current, 0) + 1);
            } else {
                map.put(current, 1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            if (key.getValue() > length / 3) {
                System.out.println(key.getKey());
                result.add(key.getKey());
            }
        }
        return result;

    }
}
