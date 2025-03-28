package org.datastructures.arrays;

import java.util.Arrays;

public class MedianOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int firstLength = nums1.length;
        int secondLength = nums2.length;
        int[] result = new int[firstLength + secondLength];
        double median = 0.0;
        int first = 0, second = 0, i = 0;

        //merge nums1 and nums2 into result arrays
        while (first < firstLength && second < secondLength) {
            if (nums1[first] <= nums2[second]) {
                result[i++] = nums1[first++];
            } else {
                result[i++] = nums2[second++];
            }
        }

        //add the remaining numbers
        while (first < firstLength) {
            result[i++] = nums1[first++];
        }

        while (second < secondLength) {
            result[i++] = nums2[second++];
        }

        System.out.println(Arrays.toString(result));

        int length = firstLength + secondLength;

        //find the median
        if (length % 2 == 0) {
            median = (result[length / 2 - 1] + result[length / 2]) / 2.0;
        } else {
            median = result[length / 2];
        }

        return median;
    }
}
