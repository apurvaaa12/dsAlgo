package org.datastructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exam {
    public static void main(String[] args){
        int[] array = {1,2,2,3,2};

        waveArray(array);
        System.out.println(Arrays.toString(array));

        String[] string = {"abc","0","12"};
        List<String> list = Arrays.asList(string);
        Collections.sort(list);
        System.out.println(Arrays.toString(string));
    }
    public static void waveArray(int[] array){
        int length = array.length;
        Arrays.sort(array);
        for(int i=1;i<length-1;i++){
            if(array[i] > array[i-1] && array[i] < array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
    }
}
