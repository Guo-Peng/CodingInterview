package com.guopeng.algorithm.codeinterview.chapter6;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/2/18.
 */
public class TreeDepth {
    /**
     * 求二叉树的最大深度
     *
     * @param root
     * @return
     * @comment 子节点的最大深度加1为父节点的最大深度
     */
    public int treeDepth(BinaryTreeNode root) {
        if (root == null) return 0;

        int left = treeDepth(root.left);
        int right = treeDepth(root.right);

        return Math.max(left + 1, right + 1);
    }

    /**
     * 二叉树是否为平衡二叉树
     * 左右子树的高度差值小于1
     *
     * @param root
     * @return
     * @comment 子节点的深度传递进去并返回该节点的最大深度
     * 判断子节点是否为平衡二叉树再判断该节点是否为平衡
     */
    public Boolean isBalance(BinaryTreeNode root) {
        if (root == null) return false;

        int left = isBalanceNode(root.left, 1);
        int right = isBalanceNode(root.right, 1);

        return left != -1 && right != -1 && Math.abs(left - right) <= 1;
    }

    private int isBalanceNode(BinaryTreeNode root, int depth) {
        if (root == null) return depth;

        int left = isBalanceNode(root.left, depth + 1);
        int right = isBalanceNode(root.right, depth + 1);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1) return -1;
        else return Math.max(left, right);
    }
}
