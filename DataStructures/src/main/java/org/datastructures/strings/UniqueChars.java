package org.datastructures.strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueChars {
    public static void main(String[] args){
        String s = "leetcode";
        int uniqueChar = firstUniqChar(s);
        char firstChar = firstUniqueChar(s);
        System.out.println(uniqueChar);
        System.out.println(firstChar);
    }
    public static int firstUniqChar(String s) {
      int[] count = new int[26];
      for(char ch : s.toCharArray()){
          count[ch-'a']++;
      }
        System.out.println(Arrays.toString(count));
      for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
          if(count[ch-'a']==1){
              System.out.println(ch);
             return i;
          }
      }

      return -1;
    }

    public static char firstUniqueChar(String s) {
        int[] count = new int[26];
        for(char ch : s.toCharArray()){
            count[ch-'a']++;
        }
        System.out.println(Arrays.toString(count));
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(count[ch-'a']==1){
                System.out.println(ch);
                return ch;
            }
        }

        return ' ';
    }
}
