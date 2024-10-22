package org.datastructures.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] str = {"flower","flow","flight"};
        String longestPrefix = longestCommonPrefix(str);
        System.out.println("The longest common prefix of the string: " +longestPrefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length ==0) return "";

        String prefix = strs[0];
        for(int i=1;i< strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}

// prefix = flower
// [flow,flight]
// inside the while look we're checking if the element in the array doesn't contain the prefix we are removing the element in the prefix
