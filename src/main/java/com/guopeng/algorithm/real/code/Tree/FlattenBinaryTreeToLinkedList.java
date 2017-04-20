package com.guopeng.algorithm.real.code.Tree;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/4/20.
 */
public class FlattenBinaryTreeToLinkedList {
    public void flatten1(BinaryTreeNode root) {
        convert(root);
    }

    public BinaryTreeNode convert(BinaryTreeNode root) {
        if (root == null) return root;

        BinaryTreeNode right = root.right;
        root.right = root.left;
        root.left = null;

        BinaryTreeNode last = root;
        if (root.right != null)
            last = convert(root.right);

        last.right = right;

        if (right != null)
            last = convert(right);

        return last;
    }

    BinaryTreeNode prev;

    public void flatten(BinaryTreeNode root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

    public String print(BinaryTreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();

        BinaryTreeNode cur = root;
        while (cur != null) {
            stringBuilder.append(cur.value);
            cur = cur.right;
        }

        return stringBuilder.toString();
    }
}
