package org.datastructures.arrays;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = new int[]{-12,14,-15,-17,20};
        int secondLargest = findSecondLargest(5,arr);
        System.out.println(secondLargest);
    }

    public static int findSecondLargest(int n, int[] arr) {
        int firstLargest= -1 , secondLargest = -1;
        for(int i=0;i<arr.length;i++){
            if(firstLargest<arr[i]){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            if(secondLargest<arr[i] && arr[i]<firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
