package org.datastructures.trees;

import java.util.ArrayList;
import java.util.List;

public class Btree {

    static class Node {
        String value;
        Node left, right;

        Node(String node) {
            this.value = node;
            left = right = null;
        }
    }

    static Node root;

    public static void main(String[] args) throws InterruptedException {
        Btree btree = new Btree();
        btree.root = new Node("A");
        btree.root.left = new Node("B");
        btree.root.right = new Node("C");
        btree.root.left.left = new Node("D");
        btree.root.left.right = new Node("E");
        btree.root.right.left = new Node("F");
        btree.root.right.right = new Node("G");

        printTree(btree.root, 0);

        List<String> inorderList = new ArrayList<>();
        inorderTraversal(btree.root, inorderList);
        System.out.println("Inorder traversal :  " + inorderList);

        List<String> preorderList = new ArrayList<>();
        preorderTraversal(btree.root, preorderList);
        System.out.println("preorder traversal :  " + preorderList);

        List<String> postorderList = new ArrayList<>();
        postorderTraversal(btree.root, postorderList);
        System.out.println("postorder traversal :  " + postorderList);


        int maxDepth = maxDepthOfBinaryTree(root);
        System.out.println("Max depth of the tree: " +maxDepth);

    }

    static void inorderTraversal(Node root, List<String> output) {
        if (root != null) {
            System.out.println(root.value);
            inorderTraversal(root.left, output);
            output.add(root.value);
            inorderTraversal(root.right, output);
        }
    }

    static void preorderTraversal(Node root, List<String> output) throws InterruptedException {
        if (root != null) {
            System.out.println(root.value);
            Thread.sleep(1000);
            output.add(root.value);
            System.out.println(output);
            preorderTraversal(root.left, output);
            preorderTraversal(root.right, output);
        }
    }

    static void postorderTraversal(Node root, List<String> output) {
        if (root != null) {
            postorderTraversal(root.left, output);
            postorderTraversal(root.right, output);
            output.add(root.value);
        }
    }

    static void printTree(Node root, int level) {
        if (root == null) return;

        printTree(root.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(root.value);
        printTree(root.left, level + 1);

    }

    static int maxDepthOfBinaryTree(Node root){
        if(root == null ) return 0;
        int left = maxDepthOfBinaryTree(root.left);
        int right = maxDepthOfBinaryTree(root.right);
        return Math.max(left,right) +1;

    }

}
