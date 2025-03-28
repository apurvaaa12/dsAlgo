package org.datastructures.strings;

public class DecodeWays {
    public static void main(String[] args) {
        String s = "12";
        int numOfWays = numDecodings(s);
        System.out.println(numOfWays);
    }

    //bottomup processing

    public static int numDecodings(String s) {
        int[] dpArray = new int[s.length() + 1];
        dpArray[0] = 1;
        dpArray[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            int twoDigit = Integer.valueOf(s.substring(i - 2, i));

            if (oneDigit >= 1) {
                dpArray[i] = dpArray[i] + dpArray[i - 1];
            }

            if (twoDigit >= 10 && twoDigit <= 26) {
                dpArray[i] = dpArray[i] + dpArray[i - 2];
            }
        }
        return dpArray[s.length()];
    }
}
