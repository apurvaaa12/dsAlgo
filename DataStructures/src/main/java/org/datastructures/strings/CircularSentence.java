package org.datastructures.strings;

import java.util.Arrays;

public class CircularSentence {
    public static void main(String[] args) {
        String str = "leetcode exercises sound delightful";
        System.out.println(isCircularSentence(str));
    }

    public static boolean isCircularSentence(String sentence) {
        String[] stringArray = sentence.split(" ");

        if (stringArray.length == 1)
            return true;


        for (int i = 0; i < stringArray.length - 1; i++) {
            char[] charArray = stringArray[i].toCharArray();
            int charLength = charArray.length - 1;
            if (stringArray[i].charAt(charLength) == stringArray[i + 1].charAt(0)) {
                return true;
            }
        }
        return false;
    }
}


//for(int j=0;j<charArray.length;j++){
//        System.out.println(charArray[charArray.length-1] +""+ stringArray[i+1].charAt(j));
//        }
//  System.out.println(stringArray[i].charAt(charLength));
//            System.out.println(stringArray[i+1].charAt(0));