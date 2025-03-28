package org.datastructures.trees;

public class BinaryTreeRepresentation {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        printTree(root, 0);

    }

    static void printTree(TreeNode root, int level) {
        if (root == null) return;

        printTree(root.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(root.val);
        printTree(root.left, level + 1);

    }


}
