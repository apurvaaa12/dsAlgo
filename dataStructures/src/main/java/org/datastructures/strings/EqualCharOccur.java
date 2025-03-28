package org.datastructures.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class EqualCharOccur {

    public static void main(String[] args){
        String input = "aaabb";
        Boolean output = areOccurrencesEqual(input);
        System.out.println(output);
    }

    public static boolean areOccurrencesEqual(String s) {
        if(s.length()==0) return true;
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);
            if(map.containsKey(current)){
                map.put(current,map.getOrDefault(current,0)+1);
            }else{
                map.put(current,1);
            }
        }
        boolean answer = new HashSet<>(map.values()).size() <=1;

        return answer;

    }
}
