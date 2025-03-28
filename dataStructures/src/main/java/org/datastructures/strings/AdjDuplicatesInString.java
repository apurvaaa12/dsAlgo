package org.datastructures.strings;

public class AdjDuplicatesInString {

    public static void main(String[] args){
        String input = "abbaca";
        String output = removeDuplicates(input);
        System.out.println(output);
    }

    public static String removeDuplicates(String s) {
        StringBuilder outputString = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int len = outputString.length();
            if (len > 0 && outputString.charAt(len - 1) == ch) {
                outputString.deleteCharAt(len - 1);  // Remove duplicate
            } else {
                outputString.append(ch);
            }
        }

        return outputString.toString();

    }
}
