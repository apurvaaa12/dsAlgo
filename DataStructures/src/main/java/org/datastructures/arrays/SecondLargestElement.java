package org.datastructures.arrays;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = new int[]{-12,14,-15,-17,20};
        int secondLargest = findSecondLargest(5,arr);
        System.out.println(secondLargest);
    }

    public static int findSecondLargest(int n, int[] arr) {
        int firstLargest= Integer.MIN_VALUE , secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(firstLargest<arr[i]){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            if(secondLargest<arr[i] && arr[i]<firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
