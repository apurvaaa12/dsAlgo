package org.datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> output = fullJustify(words, maxWidth);
        System.out.println(output);
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;
        //process all the words
        while (index < words.length) {
            int totalChars = words[index].length(); // length of current word
            int last = index + 1;

            // Try to fit as many words as possible into a line
            while (last < words.length) {
                // +1 for the space between words
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length();
                last++;
            }

            // Number of words in this line = last - index
            int numWords = last - index;
            int numSpaces = maxWidth - totalChars + (numWords - 1); // Total spaces to distribute

            StringBuilder line = new StringBuilder();

            // Check if this is the last line or line contains only one word
            if (last == words.length || numWords == 1) {
                // Left-justified
                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) line.append(" "); // space between words
                }
                // Fill remaining space at the end
                int remaining = maxWidth - line.length();
                while (remaining-- > 0) line.append(" ");
            }
            else {
                // Fully justified line
                int spaceSlots = numWords - 1; // gaps between words
                int evenSpace = numSpaces / spaceSlots; // minimum spaces per gap
                int extraSpace = numSpaces % spaceSlots; // left slots get extra space

                for (int i = index; i < last; i++) {
                    line.append(words[i]);
                    if (i < last - 1) {
                        // Calculate space to append
                        int spacesToApply = evenSpace + (extraSpace-- > 0 ? 1 : 0);
                        while (spacesToApply-- > 0) line.append(" ");
                    }
                }
            }

            result.add(line.toString());
            index = last; // Move to next line
        }

        return result;
    }
}

