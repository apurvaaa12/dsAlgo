package org.datastructures.strings;

import java.util.Stack;

public class RemoveDuplicatesFromAdjacentStringii {
    public static void main(String[] args){
        String s = "deeedbbcccbdaa";
        int k = 2;
        String removeDuplicates = removeDuplicates(s,k);
        System.out.println(removeDuplicates);
    }


    //Keep Track of adjacent frequencies as initally they may not have adj duplicates
    //Upon certain remove we might end up creating a duplicate
    public static String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (char current : s.toCharArray()) {
            if(!charStack.isEmpty() && charStack.peek() == current){
                System.out.println(current);
                countStack.push(countStack.pop()+1); //increasing the count
            }else {
                charStack.push(current);
                countStack.push(1); // Initialize count to 1
            }

            if (countStack.peek() == k) {
                charStack.pop();
                countStack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            char c = charStack.pop();
            int count = countStack.pop();
//            result.append(String.valueOf(c).repeat(count)); // Append character count times
        }
        return result.reverse().toString();
    }
}
