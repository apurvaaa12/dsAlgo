package org.datastructures.strings;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupStrs = groupAnagrams(strs);
        System.out.println(groupStrs);

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] current = str.toCharArray();
            Arrays.sort(current);
            String sortedString = String.valueOf(current);

            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
