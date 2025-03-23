package org.datastructures.arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trap = trap(height);
        System.out.println(trap);
    }

    public static int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = height.length - 1;
        int total = 0;
        while (left < right) {
            if (height[left] <= height[right]) {
                if (leftMax < height[left]) {
                    leftMax = height[left];
                }
                total = total + (leftMax - height[left]);
                left = left + 1;
            } else {
                if (rightMax < height[right]) {
                    rightMax = height[right];
                }
                total = total + (rightMax - height[right]);
                right = right - 1;
            }
        }

        return total;

    }
}


