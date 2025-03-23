package org.datastructures.arrays;

import java.util.Arrays;

public class MinArrowBurstBalloon {
    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int minArrow = findMinArrowShots(points);
        System.out.println(minArrow);
    }

    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        // Sort balloons by their end coordinates (greedy choice)
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1; // At least one arrow is needed
        int end = points[0][1]; // First arrow targets the first balloon's end
        for (int i = 1; i < points.length; i++) {
            // If the balloon starts after the current arrow's range, shoot a new arrow
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1]; // Update the arrow's position
            }
        }
        return arrows;
    }
}
