package org.datastructures.strings;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static void main(String[] args){
        String str1 = "abc", str2 = "bbbca";
        System.out.println(checkInclusion(str1,str2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int firstLength = s1.length(), secondLength = s2.length();
        if (secondLength < firstLength) return false; // No permutation is possible

        HashMap<Character,Integer> firstMap = new HashMap<>();
        HashMap<Character,Integer> secondMap = new HashMap<>();

        for(int i=0;i<firstLength;i++){
            char current = s1.charAt(i);
            char secondCurrent = s2.charAt(i);
            firstMap.put(current,firstMap.getOrDefault(current,0)+1);
            secondMap.put(secondCurrent,secondMap.getOrDefault(secondCurrent,0)+1);
        }

        if(firstMap.equals(secondMap)){
            return true;
        }

        for(int i= firstLength;i<secondLength;i++){
            char newChar = s2.charAt(i);
            char oldChar = s2.charAt(i-firstLength);

            //Add new character to the window
            secondMap.put(newChar,secondMap.getOrDefault(newChar,0)+1);

            //Remove new character
            if(secondMap.get(oldChar)==1){
                secondMap.remove(oldChar);
            }else{
                secondMap.put(oldChar,secondMap.get(oldChar)-1);
            }

            if(firstMap.equals(secondMap)){
                return true;
            }
        }
        return false;
    }

}



//check if any substring of s2 is an anagram of s1 in s2
//Sliding window technique

