package org.datastructures.strings;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args){
        char[] chars = {'a','a','b','b','c','c','c'};
        int compressed = compress(chars);
        System.out.println(compressed);

    }
    public static int compress(char[] chars) {
        int write = 0; // Pointer to modify the input array
        int i = 0; // Pointer to traverse the input array

        while (i < chars.length) {
            char current = chars[i];
            int count =0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            // Write the character
            chars[write++] = current;

            // Write the count if >1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c; // Convert count to characters and store
                }
            }
        }
        return write;
    }
}
