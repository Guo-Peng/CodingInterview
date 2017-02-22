package com.guopeng.algorithm.codeinterview.utils;

/**
 * Created by guopeng on 2017/2/10.
 */
public class BinaryTreeNode {
    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public static String preOrder(BinaryTreeNode root) {
        if (root == null) return "";

        return root.value + preOrder(root.left) + preOrder(root.right);
    }

    public static String inOrder(BinaryTreeNode root) {
        if (root == null) return "";

        return inOrder(root.left) + root.value + inOrder(root.right);
    }

    public static String postOrder(BinaryTreeNode root) {
        if (root == null) return "";

        return postOrder(root.left) + postOrder(root.right) + root.value;
    }
}