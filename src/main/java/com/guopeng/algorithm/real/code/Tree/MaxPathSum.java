package com.guopeng.algorithm.real.code.Tree;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Given a binary tree, find the maximum path sum.
 * <p>
 * For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections.
 * The path must contain at least one node and does not need to go through the root.
 * <p>
 * For example:
 * Given the below binary tree,
 */
public class MaxPathSum {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(BinaryTreeNode root) {
        maxPath(root);
        return max;
    }

    public int maxPath(BinaryTreeNode root) {
        if (root == null) return 0;

        int left = Math.max(0, maxPath(root.left));
        int right = Math.max(0, maxPath(root.right));
        max = Math.max(max, left + right + root.value);
        return Math.max(left, right) + root.value;
    }
}
