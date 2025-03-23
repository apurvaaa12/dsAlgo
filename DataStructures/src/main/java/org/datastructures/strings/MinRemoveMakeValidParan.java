package org.datastructures.strings;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinRemoveMakeValidParan {
    public static void main(String[] args){
        String s = "lee(t(c)o)de)";
        String output = minRemoveToMakeValid(s);
        System.out.println(output);
    }
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> remove = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    remove.add(i);
                }
            }
        }

        while (!stack.isEmpty()) {
            remove.add(stack.pop());
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!remove.contains(i)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
