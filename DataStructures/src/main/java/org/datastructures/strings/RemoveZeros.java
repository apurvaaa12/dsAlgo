package org.datastructures.strings;

public class RemoveZeros {
    public static void main(String[] args){
        String str = "51230100";
        str = removeZeros(str); // Assign the modified string to 'str'
        System.out.println(str);
    }

    public static String removeZeros(String str){
       int i =0;
       int j =str.length()-1;
       while(str.charAt(i) =='0' && i <str.length()){
           i++;
       }

       str = str.substring(i);
       System.out.println(str);
       while(str.charAt(j) == '0' && j>=0){
           j--;
       }

       str = str.substring(0,j+1);
       return str;
    }
}