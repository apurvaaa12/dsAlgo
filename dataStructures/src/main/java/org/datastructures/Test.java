package org.datastructures;


import java.util.HashMap;
import java.util.Map;

//Problem :- Check if the array is balanced array or not.
//Description:- A balanced array is defined to be an array where for every value n in the array, -n is also in the array.
//Example 1:- {-2, 3, 2, -3} is a balanced array.
//Example 2:- {1,1,-1,-1} is a balanced array.
//Example 3:- {1,1,-1} is a NOT balanced array.
//Example 4:- {-2, 3, 2, -3, 0, 5,-5} is a balanced array.
//Example 5:- {1, 2, -3} is NOT a balanced array.
//Example 6:- {-3,-2, -3, -2, 4, 1, 4, 1 , 3, 2, -4, -1} is NOT a balanced array
//Note:-
//1. Zeroes can be ignored.
//2. There can be duplicates in the array. Every duplicate n needs to have -n
public class Test {
    public static void main(String[] args) {
//        int[] array = {-2, 2,1};
        int[] array = {-3, -2, -3, -2, 4, 1, 4, 1, 3, 2, -4, -1};
        boolean balanced = isBalanced(array);
        System.out.println(balanced);
    }

    public static boolean isBalanced(int[] array) {
        int length = array.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int current = array[i]; //-2
            if (map.containsKey(current)) {
                map.put(current, map.getOrDefault(current, 0) + 1);
            } else {
                map.put(current, 1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Integer, Integer> key : map.entrySet()) {
            int negative = -1 * key.getKey();
            int negativeValue = 0;
            if (map.containsKey(negative)) {
                negativeValue = map.get(negative);
            }
            if (key.getValue() == negativeValue) {
                return true;
            }
        }

        return false;
    }

}
