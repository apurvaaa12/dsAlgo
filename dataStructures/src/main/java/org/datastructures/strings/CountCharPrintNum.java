package org.datastructures.strings;

public class CountCharPrintNum {
    public static void main(String[] args){

        String input = "aaabbbbbccccdaa";
        String output = printNumeric(input);
        System.out.println(output);

    }

    static String printNumeric(String input){
        int count =1;
        StringBuilder outputString = new StringBuilder();
        for(int i =1;i<input.length()-1;i++){
           if(input.charAt(i)==input.charAt(i-1)){
               count++;
           }else{
               outputString.append(input.charAt(i-1)).append(count);
               count =1;
           }
        }

        outputString.append(input.charAt(input.length()-1)).append(count);

        return outputString.toString();
    }

}
