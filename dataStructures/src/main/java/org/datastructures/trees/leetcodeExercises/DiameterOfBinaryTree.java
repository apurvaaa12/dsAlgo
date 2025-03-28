package org.datastructures.trees.leetcodeExercises;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        List<Integer> values = Arrays.asList(1,2,3,4,5);
        List<Integer> values = Arrays.asList(1, 2);
        Node root = constructBst(values);
        inorderTraversal(root);
        int diameter = diameterOfBSt(root);
        System.out.println();
        System.out.println("Diameter of a Binary tree: " + diameter);
    }

    public static Node constructBst(List<Integer> values) {
        if (values == null || values.isEmpty()) {
            return null;
        }
        Node root = new Node(values.get(0));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (i < values.size()) {
            Node current = queue.poll();
            if (values.get(i) != null) {
                current.left = new Node(values.get(i));
                queue.add(current.left);
            }
            i++;

            if (i < values.size() && values.get(i) != null) {
                current.right = new Node(values.get(i));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.value);
        inorderTraversal(root.right);
    }

    static int maxDiameter = 0;
    public static int diameterOfBSt(Node root) {
        calculateDiameter(root);
        return maxDiameter;
    }

    public static int calculateDiameter(Node root){
        if(root == null) return 0;

        int left  = calculateDiameter(root.left);
        int right = calculateDiameter(root.right);
        int currentDiameter = left+right;

        maxDiameter = Math.max(maxDiameter,currentDiameter);

        return Math.max(left,right)+1;
    }


}
