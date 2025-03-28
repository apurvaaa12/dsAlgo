package org.datastructures.sortingAlgos;

import java.util.Arrays;


//https://www.youtube.com/watch?v=MP_Of5rZ6sQ
// start from index 1 and check all the small elements to the left of the array and swap if you find a lesser element
//After comparing elements to the left shift the elements to the right to make room to insert the value
//O(n^2)
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array){
        for(int i=1;i<array.length;i++){
            int temp = array[i];
            int j = i-1;

            while( j >=0 && array[j] > temp){
                //shift an element to the right
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
