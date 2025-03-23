package org.datastructures.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUnion {
    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5}, b[] = {1, 2, 3, 6, 7};
        int[] result = findUnion(a,b);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findUnion(int[] first, int[] second){
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<first.length;i++){
            set.add(first[i]);
        }

        for(int i=0;i<second.length;i++){
            set.add(second[i]);
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
