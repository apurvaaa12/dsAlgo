package org.datastructures.linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SecondHighestSalary {

    public static void main(String[] args){
        List<Integer> number =  new LinkedList<>();
        number.add(4);
        number.add(1);
        number.add(5);
        number.add(3);
        number.add(4);
        number.add(8);
        number.add(9);
        number.add(11);
        System.out.println(number);
        int secondLargest = secondLargest(number);
        System.out.println(secondLargest);
    }

    public static int secondLargest(List<Integer> number){
//        Collections.sort(number);
//        System.out.println(number);
//        return number.get(number.size()-2);
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<number.size();i++){
            if(number.get(i) > first){
                second = first;
                first = number.get(i);
            }
            if(second < number.get(i) && first>number.get(i)){
                second = number.get(i);
            }
        }

        return second;
    }
}
