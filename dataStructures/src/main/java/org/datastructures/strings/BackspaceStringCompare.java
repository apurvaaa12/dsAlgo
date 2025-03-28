package org.datastructures.strings;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String one = "ab#c";
        String two = "ad#c";
        boolean isSame = backspaceCompare(one, two);
        System.out.println(isSame);
    }

    public static boolean backspaceCompare(String s, String t) {
        String one = updatedString(s);
        String two = updatedString(t);
        return one.equals(two);

    }

    private static String updatedString(String input) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '#') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    result.append(input.charAt(i));
                }
            }
        }

        return result.reverse().toString();
    }
}


