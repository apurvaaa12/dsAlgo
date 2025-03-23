package org.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class FractionToDecimal {

    public static void main(String[] args) {
        int numerator = -22;
        int denominator = -2;
        String output = fractionToDecimal(numerator, denominator);
        System.out.println(output);
    }

    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";  // Case: numerator is zero

        StringBuilder result = new StringBuilder();

        // Handle negative sign
        if(numerator < 0 && denominator > 0 || numerator > 0 && denominator < 0) result.append("-");

        //Convert into long to prevent overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Integer part
        result.append(num / den);
        long remainder = num % den;
        if (remainder == 0) return result.toString(); // No decimal part

        // Decimal part
        result.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) { // Repeating decimal found
                result.insert(map.get(remainder), "(");
                result.append(")");
                break;
            }

            map.put(remainder, result.length());
            remainder = remainder * 10;
            result.append(remainder / den);
            remainder = remainder % den;
        }

        return result.toString();
    }
}
