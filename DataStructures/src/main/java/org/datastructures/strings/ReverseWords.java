package org.datastructures.strings;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String string = "the sky is blue";
        String reverse = reverseWords(string);
        System.out.println(reverse);

    }

    public static String reverseWords(String s) {
        String[] stringArray = s.split(" ");
        System.out.println(Arrays.toString(stringArray));
        int start = 0;
        int end = stringArray.length - 1;
        while (start < end) {
            String temp = stringArray[start];
            stringArray[start] = stringArray[end];
            stringArray[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(stringArray));
        String reverse = String.join(" ",stringArray).trim().replaceAll(" +"," ");
        return reverse;
    }
}

