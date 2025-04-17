package org.datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class Trie {
    List<String> trieList;
    public Trie() {
        this.trieList  = new ArrayList<>();
        System.out.println(trieList);
    }

    public void insert(String word) {
        trieList.add(word);
    }

    public boolean search(String word) {
        boolean isPresent = false;
        if(trieList.contains(word)){
            isPresent = true;
        }
       return isPresent;
    }

    public boolean startsWith(String prefix) {
        boolean isPresent = false;
        for (String s : trieList) {
            if (s.startsWith(prefix)) {
                isPresent = true;
            }
        }
        return isPresent;
    }

    public static void main(String[] args){
        Trie trie = new Trie();
        trie.insert("Apple");
        System.out.println(trie.search("pen"));
        System.out.println(trie.startsWith("App"));
//        System.out.println(trie);
    }
}
