package org.datastructures.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/solutions/5888834/super-simple-approach-beats-100-o-1-space-and-o-n-time-youtube-video-added/
public class MinParentheses {
    public static void main(String[] args){
        String str = "()))((";
        int minAdditions = minAddToMakeValid(str);
        System.out.println(minAdditions);

    }

    public static int minAddToMakeValid(String s) {
        if(s.isEmpty()) return 0;

        int open =0;
        int misMatch =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') {
                open++;
            }else{
                if(open>0){
                    open--;
                }else{
                    misMatch++;
                }
            }
        }
        return open+misMatch;
    }
}
