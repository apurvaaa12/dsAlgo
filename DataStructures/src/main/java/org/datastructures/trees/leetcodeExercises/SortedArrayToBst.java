package org.datastructures.trees.leetcodeExercises;

import java.util.ArrayList;
import java.util.List;

public class SortedArrayToBst {

    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }

    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        sortedArrayToBST(nums);
    }

    //To find the root of the binary search tree in a sorted array we just have to find the middle element.
    //middle = 0+(array.length-1)/2
    //Return middle element.
    public static void sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length == 0) return;

        buildBST(nums, 0, nums.length - 1);
    }

    private static Node buildBST(int[] nums, int left, int right) {
        if (left > right) return null;
        int midElement = left + (right - left) / 2;

        Node root = new Node(nums[midElement]);
        root.left = buildBST(nums, left, midElement - 1);
        root.right = buildBST(nums, midElement + 1, right);
        List<Integer> output = new ArrayList<>();
        inorderTraversal(root, output);
        System.out.println("The binary tree is: " + output);
        return root;
    }

    static void inorderTraversal(Node root, List<Integer> output) {
        if (root == null) return;
        inorderTraversal(root.left, output);
        output.add(root.value);
        inorderTraversal(root.right, output);
    }
}
