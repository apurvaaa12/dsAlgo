package org.datastructures.strings;

import java.util.Arrays;
import java.util.HashMap;

public class UniqueChars {
    public static void main(String[] args){
        String s = "leetcode";
//        int uniqueChar = firstUniqChar(s);
        char firstChar = firstUniqueChar(s);
//        System.out.println(uniqueChar);
        System.out.println(firstChar);
    }
//    public static int firstUniqChar(String s) {
//      int[] count = new int[26];
//      for(char ch : s.toCharArray()){
//          count[ch-'a']++;
//      }
//        System.out.println(Arrays.toString(count));
//      for(int i=0;i<s.length();i++){
//          char ch = s.charAt(i);
//          if(count[ch-'a']==1){
//              System.out.println(ch);
//             return i;
//          }
//      }
//
//      return -1;
//    }
//
//    public static char firstUniqueChar(String s) {
//        int[] count = new int[26];
//        for(char ch : s.toCharArray()){
//            count[ch-'a']++;
//        }
//        System.out.println(Arrays.toString(count));
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(count[ch-'a']==1){
//                System.out.println(ch);
//                return ch;
//            }
//        }
//
//        return ' ';
//    }


    public static char firstUniqueChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(countMap);

        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }


}
