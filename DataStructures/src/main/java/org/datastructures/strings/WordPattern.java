package org.datastructures.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args){
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] stringArray = s.split(" ");
        if(pattern.length() != stringArray.length) return false;
        Map<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char currentChar = pattern.charAt(i);
            //if the map already contains the current character
            //we are checking if the character is already mapped to the value
            //If the value of the character is not the same then we are returning false
            //else in the case if map doesn't contain value we are putting current character and the word
            if(map.containsKey(currentChar)){
                if(!map.get(currentChar).equals(stringArray[i])){
                    return false;
                }
            }else{
                if(map.containsValue(stringArray[i])) return false;
                map.put(currentChar,stringArray[i]);
            }
        }

        System.out.println(map);
        return true;
    }
}
