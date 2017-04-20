package com.guopeng.algorithm.util.tree;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/4/20.
 */
public class MinimumDepth {
    public int minimumDepth(BinaryTreeNode root) {
        if (root == null)
            return 0;

        int left = minimumDepth(root.left);
        int right = minimumDepth(root.right);

        if (left == 0 || right == 0)
            return 1 + Math.max(left, right);
        else
            return 1 + Math.min(left, right);
    }
}
