package org.datastructures.strings;

public class Strings {
    public static void main(String[] args){
        String str = "Happy";
        str = str + " Birthday!" ;
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder("Apple");
        stringBuilder.append("Y");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Mumbai");
        stringBuffer.substring(4);
    }
}
