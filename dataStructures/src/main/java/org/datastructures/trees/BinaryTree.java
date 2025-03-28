package org.datastructures.trees;

public class BinaryTree {
    class Node {
        int value;
        Node left, right;

        Node(int item) {
            value = item;
            left = right = null;
        }
    }

    Node root;

    public BinaryTree() {
        root = null;
    }


    void addNode(Integer item) {
        root = addRec(root, item);
    }

    Node addRec(Node root, int item) {

        if (root == null) {
            return new Node(item);
        }

        if (item < root.value) {
            root.left = addRec(root.left, item);
        } else if (item > root.value) {
            root.right = addRec(root.right, item);
        }

        return root;
    }


    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.value + " ");
            inorderTraversal(node.right);
        }
    }


    void preorderTraversal(Node node){
        if(node!=null){
            System.out.print(node.value+" ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    void postorderTraversal(Node node){
        if(node != null){
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.value+" ");
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNode(5);
        binaryTree.addNode(1);
        binaryTree.addNode(6);
        binaryTree.addNode(2);
        binaryTree.addNode(7);
        binaryTree.addNode(3);
        binaryTree.addNode(4);

        // Print the tree to verify it was built correctly
        System.out.print("Inorder traversal: ");
        binaryTree.inorderTraversal(binaryTree.root);

        System.out.print("\nPreorder traversal: ");
        binaryTree.preorderTraversal(binaryTree.root);

        System.out.print("\nPostorder traversal: ");
        binaryTree.postorderTraversal(binaryTree.root);

    }
}