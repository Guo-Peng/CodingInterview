package com.guopeng.algorithm.codeinterview.chapter4;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/2/13.
 */
public class TreeMirror {
    /**
     * 生成二叉树的镜像
     *
     * @param root
     * @comment 依次交换左右子树
     */
    public void mirror(BinaryTreeNode root) {
        if (root == null) return;

        changeSubTree(root);
        mirror(root.left);
        mirror(root.right);
    }

    private void changeSubTree(BinaryTreeNode root) {
        BinaryTreeNode tmpNode = root.left;
        root.left = root.right;
        root.right = tmpNode;
    }
}
