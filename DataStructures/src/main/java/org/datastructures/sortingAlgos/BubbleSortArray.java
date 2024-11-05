package org.datastructures.sortingAlgos;

import java.util.Arrays;


//O(n^2)
//Adjacent elements are compared and swapped
public class BubbleSortArray {
    public static void main(String[] args){
        int[] array = {9,1,8,2,7,3,6,4,5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array){

        for(int i=0;i<array.length-1;i++){
            for(int j = i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i]=temp;
                }
            }
        }
    }
}
