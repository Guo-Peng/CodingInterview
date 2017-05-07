package com.guopeng.algorithm.real.code.Tree;

/**
 * Created by guopeng on 2017/5/7.
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        return convert(nums, 0, nums.length - 1);
    }

    private TreeNode convert(int[] nums, int low, int hi) {
        if (low > hi) return null;

        int mid = low + (hi - low) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convert(nums, low, mid - 1);
        root.right = convert(nums, mid + 1, hi);
        return root;
    }
}
