package org.datastructures.strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";

        Map<Character, Integer> charCountMap = new HashMap<>();
        StringBuilder uniqueChars = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                uniqueChars.append(c);  // Add unique character to result
            }
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(charCountMap);

        System.out.println("String without duplicates: " + uniqueChars.toString());
        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
