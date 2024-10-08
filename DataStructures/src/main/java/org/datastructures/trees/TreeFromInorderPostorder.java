package org.datastructures.trees;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.Queue;

public class TreeFromInorderPostorder {
    static class Node{
        int value;
        Node left,right;

        Node(int value){
            this.value = value;
            left = right = null;
        }
    }

    public static void main(String[] args){
        int[] inorder = {9,3,15,20,7}, postorder = {9,15,7,20,3};


        int rootValue = postorder[postorder.length-1];
        System.out.println(rootValue);

        Node root = new Node(rootValue);
        buildTree(inorder, rootValue,postorder);

    }

    private static void buildTree(int[] inorder, int rootValue,int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) {
            return;
        }
        int[] left = new int[0];
        int[] right = new int[0];
        for(int i = 0; i< inorder.length; i++){
            if(inorder[i]== rootValue){
                left = Arrays.copyOfRange(inorder,0,i);
                right =Arrays.copyOfRange(inorder,i+1, inorder.length);
            }
        }
        System.out.println("Left elements: "+ Arrays.toString(left));
        System.out.println("Right elements: "+ Arrays.toString(right));


    }
}
