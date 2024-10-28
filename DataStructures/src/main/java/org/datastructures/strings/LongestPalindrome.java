package org.datastructures.strings;

import java.util.Arrays;

public class LongestPalindrome {
    public static void main(String[] args){
        String s = "abccccdd";
        int longestPalindrome = longestPalindrome(s);
        System.out.println(longestPalindrome);
    }

    public static int longestPalindrome(String s) {
        int[] charCounts = new int[128];
        for(char c : s.toCharArray()){
            charCounts[c]++;
        }
        System.out.println(Arrays.toString(charCounts));

        int result =0 ;
        for(int count: charCounts){
            result = result+count/2*2;
            if(result%2==0 && count%2 ==1){
                result = result+1;
            }
        }

        System.out.println(result);
        return result;
    }
}

//count each character in the string
//only one different char allowed in palindrome.
//check for even number
//if the char count is even we can add it in our palindrome

