package org.datastructures.strings;

import java.util.Arrays;

//We have two operands a = 9, b = 3, and result of a/b = 3 whereas result of a%b = 0.
public class AddStrings {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        String completeString = addStrings(num1, num2);
        System.out.println(completeString);
    }

    public static String addStrings(String num1, String num2) {
        int firstLength = num1.length() - 1;
        int secondLength = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (firstLength >= 0 || secondLength >= 0 || carry != 0) {
            int a = (firstLength >= 0) ? num1.charAt(firstLength) - '0' : 0;
            int b = (secondLength >= 0) ? num2.charAt(secondLength) - '0' : 0;
            int sum = a + b + carry;
            int digit = sum % 10;
            carry = sum / 10;

            result.append(digit);
            firstLength--;
            secondLength--;
        }


        return result.reverse().toString();
    }
}
