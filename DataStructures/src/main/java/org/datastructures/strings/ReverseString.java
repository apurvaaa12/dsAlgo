package org.datastructures.strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] string = {'h', 'e', 'l', 'l', 'o'};
        reverseString(string, 0, string.length - 1);
        System.out.println(Arrays.toString(string));
    }

    public static void reverseString(char[] string, int start, int end) {
        while (start < end) {
            char temp = string[start];
            string[start] = string[end];
            string[end] = temp;
            start++;
            end--;
        }

    }
}
