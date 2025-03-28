package org.datastructures.strings;

public class LongestSmallestPalindrome {
    public static void main(String[] args) {
        String s = "egcfe";
        String longestPalindrome = makeSmallestPalindrome(s);
        System.out.println(longestPalindrome);
        System.out.println(isPalindrome(s));
    }

    public static String makeSmallestPalindrome(String s) {
        int first =0;
        int second=s.length()-1;
        char[] current = s.toCharArray();
        while(first<second){
           if(current[first] != current[second]){
               char min = (char) Math.min(current[first],current[second]);
               current[first] = min;
               current[second] = min;
           }
           first++;
           second--;
        }
        return new String(current);
    }

    public static boolean isPalindrome(String s) {
        int length = s.length();

        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
