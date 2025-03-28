package org.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] output = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(output));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        // We iterate through nums2[] and push each element into a stack.
        for (int num : nums2) {
            // If the current element in the iteration is greater than the top most element
            // in the stack, then we pop it out and add the popped out element as key and
            // the current element as the value (next greater number).
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // We repeat this process as long as the current element is greater than the top
        // most element in the stack or the stack is empty.

        int i = 0;
        for (int num : nums1) {
            result[i++] = map.getOrDefault(num, -1);
        }
        return result;
    }
}
