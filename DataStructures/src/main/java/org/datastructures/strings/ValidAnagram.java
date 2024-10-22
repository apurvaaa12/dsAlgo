package org.datastructures.strings;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] one = s.toCharArray();
        char[] two = t.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);
        return Arrays.equals(one,two);

    }
}
