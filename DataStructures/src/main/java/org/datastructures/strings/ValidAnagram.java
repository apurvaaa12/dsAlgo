package org.datastructures.strings;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
//        System.out.println(isAnagram(s, t));
        System.out.println(isAnagramMap(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] one = s.toCharArray();
        char[] two = t.toCharArray();
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        Arrays.sort(one);
        Arrays.sort(two);
        System.out.println("After sorting: " + Arrays.toString(one));
        System.out.println("After Sorting: " + Arrays.toString(two));
        return Arrays.equals(one, two);

    }

    public static boolean isAnagramMap(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> secondMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            firstMap.put(current, firstMap.getOrDefault(current, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char current = t.charAt(i);
            secondMap.put(current, secondMap.getOrDefault(current, 0) + 1);
        }

        System.out.println("FirstMap: "+firstMap + " Second map: "+secondMap);
        return firstMap.equals(secondMap);
    }
}
