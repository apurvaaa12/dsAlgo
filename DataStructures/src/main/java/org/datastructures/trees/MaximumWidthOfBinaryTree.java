//package org.datastructures.trees;
//
//
////https://www.youtube.com/watch?v=sm4UdCO2868
//public class MaximumWidthOfBinaryTree {
//
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(5);
//        ;
//        root.left.right = new TreeNode(2);
//        root.right.left = null;
//        root.right.right = new TreeNode(9);
//
//        printTree(root, 0);
//        int width = widthOfBinaryTree(root);
//        System.out.println("the maximum width of a binary tree is: " + width);
//
//    }
//
//
//    public static int widthOfBinaryTree(TreeNode root) {
//        if (root == null) return 0;
//
//
//    }
//
//    static void printTree(TreeNode root, int level) {
//        if (root == null) return;
//
//        printTree(root.right, level + 1);
//        for (int i = 0; i < level; i++) {
//            System.out.print("    ");
//        }
//        System.out.println(root.val);
//        printTree(root.left, level + 1);
//
//    }
//}
