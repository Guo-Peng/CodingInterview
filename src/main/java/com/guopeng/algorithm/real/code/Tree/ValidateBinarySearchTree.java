package com.guopeng.algorithm.real.code.Tree;

/**
 * Created by guopeng on 2017/4/22.
 */
public class ValidateBinarySearchTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    long pre = Long.MIN_VALUE;

    public boolean isValidBST1(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST1(root.left) || pre >= root.val)
            return false;
        pre = root.val;
        return isValidBST1(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }


}
