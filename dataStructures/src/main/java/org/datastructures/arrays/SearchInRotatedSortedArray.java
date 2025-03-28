package org.datastructures.arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target=0;
        int index = search(nums,0);
        System.out.println(index);

    }

    public static int search(int[] nums, int target) {
        if(nums.length==0) return 0;
        int left =0;
        int right = nums.length-1;

        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left = mid+1;
            }else{
                right=mid;
            }
        }

        int start =left;

        if(target >= nums[start] && target <= nums[right]){
            left = start;
        }
        else{
            right =start;
        }

        while(left<=right){
            int midPoint = left+(right-left)/2;

            if(nums[midPoint]==target){
                return midPoint;
            }else if(nums[midPoint] < target){
                left = midPoint+1;
            }else{
                right=midPoint-1;
            }
        }
        return -1;
    }
}
