package org.datastructures.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        //adding all the numbers from the first array inside the set
        for (Integer i : nums1) {
            set.add(i);
        }
        //check if the set contains the elements from the second array
        for (Integer i : nums2) {
            if (set.contains(i)) {
                intersect.add(i);
            }
        }

        int size = intersect.size();
        int[] answer = new int[size];
        int index = 0;
        for (Integer i : intersect) {
            answer[index++] = i;

        }
        return answer;
    }
}
