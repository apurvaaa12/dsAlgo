package org.datastructures.strings;

// https://youtu.be/y_7TC98ZO1Y?feature=shared
public class LargestOddNumber {
    public static void main(String[] args){
        String num = "35427";
        String largestOddNumber = largestOddNumber(num);
        System.out.println(largestOddNumber);
    }

    public  static String largestOddNumber(String num) {
        int length = num.length()-1;
        while(length>=0){
            int diff = num.charAt(length)-'0';
            if(diff%2 !=0){
                return num.substring(0,length+1);
            }
            length--;
        }
        return " ";
    }
}
