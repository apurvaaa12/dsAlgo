package org.datastructures.strings;


import java.util.HashSet;

public class LongestPalindrome {
    public static void main(String[] args){
        String s = "abccccdd";
        int longestPalindrome = longestPalindrome(s);
        System.out.println(longestPalindrome);
    }

    public static int longestPalindrome(String s) {
        HashSet<Character> set  = new HashSet<>();
        int length =0;

        for(char current: s.toCharArray()){
            if(set.contains(current)){
                length = length+2;
                set.remove(current);
            }else{
                set.add(current);
            }
        }
        if(!set.isEmpty()){
            length++;
        }

        return length;
     }
}

//count each character in the string
//only one different char allowed in palindrome.
//check for even number
//if the char count is even we can add it in our palindrome

