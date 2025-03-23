package org.datastructures.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] maxSlidingWindow = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(maxSlidingWindow));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        Deque<int[]> deque = new ArrayDeque<>();
        int[] result = new int[length + 1 - k];
        int j = 0;

        for (int i = 0; i < length; i++) {
            // Remove elements from back if they are smaller than current element
            while (!deque.isEmpty() && deque.peekLast()[0] <= nums[i]) {
                deque.removeLast();
            }
            // Remove elements from front if they are out of the window
            while (!deque.isEmpty() && deque.peekLast()[1] <= i - k) {
                deque.removeFirst();
            }
            // Add current element (value, index)
            deque.add(new int[]{nums[i], i});

            // Add the maximum to result once window is fully formed
            if (i >= k - 1) {
                result[j++] = deque.peekFirst()[0];
            }
        }
        return result;
    }
}
