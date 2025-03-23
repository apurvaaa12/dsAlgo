package org.datastructures.trees;


//3,9,20,null,null,15,7
public class HeightOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        printTree(root, 0);
        int height = heightOfBinaryTree(root);
        System.out.println("the height of the binary tree is: " + height);

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

    static int heightOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int left = heightOfBinaryTree(root.left);
        int right = heightOfBinaryTree(root.right);

        return Math.max(left, right) + 1;
    }
}
