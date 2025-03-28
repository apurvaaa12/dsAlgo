package org.datastructures.arrays;

import java.util.*;

//https://www.naukri.com/code360/problems/make-unique-array_920329?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube
public class MakeUniqueArray {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        int minElements = minElementsToRemove(arr);
        System.out.println(minElements);

    }

    public static int minElementsToRemove(ArrayList<Integer> arr) {
        int length = arr.size();
        System.out.println("Array Length: "+ length);
        Set<Integer> nonDuplicates = new HashSet<>(arr);
        System.out.println("Non duplicates: " + nonDuplicates.size());

        int difference = length - nonDuplicates.size();

        System.out.println("Number of elements to delete " +difference);

        return difference;

    }
}
