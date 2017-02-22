package com.guopeng.algorithm.codeinterview.chapter3;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/2/10.
 */
public class IsSubTree {
    /**
     * 判断2是否为1的子结构
     *
     * @param root1
     * @param root2
     * @return
     * @comment 先判断当前结构是否相同 再依次判断左右是否一致
     * 任一为null则抛出false
     */
    public Boolean isSubTree(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null || root2 == null) return false;

        return isSame(root1, root2) || isSubTree(root1.left, root2) || isSubTree(root1.right, root2);
    }

    private Boolean isSame(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.value != root2.value) return false;

        return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }
}
