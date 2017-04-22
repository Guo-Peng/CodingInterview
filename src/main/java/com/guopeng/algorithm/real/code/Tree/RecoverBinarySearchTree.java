package com.guopeng.algorithm.real.code.Tree;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/4/22.
 */
public class RecoverBinarySearchTree {
    BinaryTreeNode first1 = null;
    BinaryTreeNode cur1 = null;

    BinaryTreeNode first2 = null;
    BinaryTreeNode cur2 = null;

    BinaryTreeNode pre = new BinaryTreeNode(Integer.MIN_VALUE);

    public void recoverTree(BinaryTreeNode root) {
        find(root);

        if (first2 == null) {
            int tmp = first1.value;
            first1.value = cur1.value;
            cur1.value = tmp;
        } else {
            int tmp = first1.value;
            first1.value = cur2.value;
            cur2.value = tmp;
        }
    }

    public void find(BinaryTreeNode root) {
        if (root == null) return;

        find(root.left);

        if (root.value < pre.value) {
            if (first1 == null) {
                first1 = pre;
                cur1 = root;
            } else {
                first2 = pre;
                cur2 = root;
            }
        }
        pre = root;
        find(root.right);
    }
}
