package org.datastructures.strings;

import java.util.*;

public class PatternMatchString {
    public static void main(String[] args) {
        String input = "A B A B C A B A B C D";
        String output = patternMatch(input);
        System.out.println(output);
    }

    public static String patternMatch(String str) {
        Stack<String> st = new Stack<>();

        // Variable to store length of String
        int n = str.length();

        // Variable to point 1st and middle index
        int i = 0, j = n / 2;

        // Repeat the loop until
        // the entire String is checked
        while (j > 0) {
            int mid = j;

            // Compare the subString
            // from index 0 to mid-1
            // with the rest of the subString
            // after mid.
            for (i = 0; i < mid && str.charAt(i) == str.charAt(j); i++, j++);

            // If both subStrings are equal
            // then repeat the same process
            // on this subString and store
            // the remaining String into stack
            if (i == mid) {
                st.add(str.substring(j,  n));

                // Update the value of
                // String 'str' with the
                // longest repeating subString
                str = str.substring(0, i);

                // Set the new String length to n
                n = mid;

                // Initialize the 2nd pointer
                // from the mid of new String
                j = n / 2;
            }

            // If both subStrings are not equal
            // then decrement the 2nd pointer by 1
            else {
                j = mid - 1;
            }
        }

        // Pop all the elements from the stack
        // append a symbol '*' and store
        // in a output String
        while (!st.isEmpty()) {
            str = str + "* " + st.peek();
            st.pop();
        }

        return str;
    }
}
