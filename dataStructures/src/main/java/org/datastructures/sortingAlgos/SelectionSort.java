package org.datastructures.sortingAlgos;

import java.util.Arrays;


//Search through an array keep track of minimum value during each iteration
//At the end of each iteration we swap the variable
//O(n^2)
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min =i;
            for(int j = i+1 ;j <array.length;j++){
                if(array[min]> array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
