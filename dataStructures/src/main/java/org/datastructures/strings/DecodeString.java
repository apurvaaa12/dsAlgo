package org.datastructures.strings;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String outputString = decodeString(s);
        System.out.println(outputString);
    }


    private  static int position = 0;
    public static String decodeString(String s) {
        int length = s.length(), repeat = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while(position<length){
            char current = s.charAt(position);
            if(current >= 'a' && current <= 'z'){
                stringBuilder.append(current);
            }else if (current >= '0' && current <= '9'){
                repeat = repeat *10 + (current-'0');
            }else if(current == '['){
                position++; // skip the char '['
                String str = decodeString(s); // pos is diff for each call
                for (int i = 0; i < repeat; i++){
                    stringBuilder.append(str);
                }
                repeat=0;
            }else if (current == ']')
                break;
            position++;
        }
        return stringBuilder.toString();
    }
}
