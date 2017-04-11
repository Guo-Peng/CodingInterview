package com.guopeng.algorithm.util.tree;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;
import com.guopeng.algorithm.real.xiaomi.RecTree;

/**
 * Created by guopeng on 2017/4/12.
 */
public class ConstructBinarySearchTree {
    public static BinaryTreeNode constructBinarySearchTree(int[] arr) {
        if (arr == null) return null;

        BinaryTreeNode root = new BinaryTreeNode(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            add(root, arr[i]);
        }
        return root;
    }

    public static void add(BinaryTreeNode root, int num) {
        if (num < root.value) {
            if (root.left != null)
                add(root.left, num);
            else root.left = new BinaryTreeNode(num);
        } else if (num > root.value) {
            if (root.right != null)
                add(root.right, num);
            else root.right = new BinaryTreeNode(num);
        }
    }

    public static void main(String[] args) {
        RecTree recTree = new RecTree();
        int[] arr = {5, 3, 1, 6, 9, 2, 0};
        System.out.println(recTree.preOrder(constructBinarySearchTree(arr)));
        System.out.println(recTree.inOrder(constructBinarySearchTree(arr)));
        System.out.println(recTree.postOrder(constructBinarySearchTree(arr)));
    }
}
