package com.guopeng.algorithm.real.code.Tree;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/4/22.
 */
public class RecoverBinarySearchTree {
    BinaryTreeNode first = null;
    BinaryTreeNode cur = null;

    BinaryTreeNode pre = new BinaryTreeNode(Integer.MIN_VALUE);

    public void recoverTree(BinaryTreeNode root) {
        find(root);

        int tmp = first.value;
        first.value = cur.value;
        cur.value = tmp;
    }

    public void find(BinaryTreeNode root) {
        if (root == null) return;

        find(root.left);

        if (root.value < pre.value) {
            if (first == null) {
                first = pre;
                cur = root;
            } else {
                cur = root;
            }
        }
        pre = root;
        find(root.right);
    }
}
