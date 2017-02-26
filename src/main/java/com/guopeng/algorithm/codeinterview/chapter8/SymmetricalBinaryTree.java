package com.guopeng.algorithm.codeinterview.chapter8;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/2/26.
 */
public class SymmetricalBinaryTree {
    /**
     * 判断二叉树是否对称
     *
     * @param root
     * @return
     * @comment 定义对称前序遍历 根 右 左
     * 将对称前序遍历与前序遍历结果相对比，相等则对称
     */
    public boolean symmetricalBinaryTreePrint(BinaryTreeNode root) {
        if (root == null) return false;
        return preOrder(root).equals(symmetricalPreOrder(root));
    }

    /**
     * 判断两个子树是否对称，先比较子树根节点值是否一致
     * 比较第一个子树的左子树与第二个子树的右子树是否对称
     * 比较第一个子树的右子树与第二个子树的左子树是否对称
     *
     * @param root
     * @return
     */
    public boolean symmetricalBinaryTree(BinaryTreeNode root) {
        return isSymmetrical(root, root);
    }

    private boolean isSymmetrical(BinaryTreeNode left, BinaryTreeNode right) {
        if (left == null && right == null) return true;
        else if (left == null || right == null) return false;

        if (left.value != right.value) return false;

        return isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
    }

    private String preOrder(BinaryTreeNode root) {
        if (root == null) return "null";

        return root.value + preOrder(root.left) + preOrder(root.right);
    }

    private String symmetricalPreOrder(BinaryTreeNode root) {
        if (root == null) return "null";

        return root.value + symmetricalPreOrder(root.right) + symmetricalPreOrder(root.left);
    }
}
