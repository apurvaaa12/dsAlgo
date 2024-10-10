package org.datastructures.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/?envType=problem-list-v2&envId=array&difficulty=EASY
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length -1;
        while (k >= 0) {
            if(i<0){
                nums1[k] = nums2[j--];
            }else if( j< 0) {
                nums1[k] = nums1[i--];
            }
            else{
                if(nums1[i]> nums2[j]){
                    nums1[k] = nums1[i--];
                }else{
                    nums1[k] = nums2[j--];
                }
            }
            k--;
        }

    }
}

//      i     k    j
// [1,2,3,0,0,0]  [2,5,6]
//