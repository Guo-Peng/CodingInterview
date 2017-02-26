package com.guopeng.algorithm.codeinterview.chapter8;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/2/26.
 */
public class NextNodeInBinaryTrees {
    public BinaryTreeNode getNext(BinaryTreeNode node) {
        if (node == null) return null;

        // 右子树不为空则找到右子树的最左子节点
        BinaryTreeNode cur = node;
        if (node.right != null) {
            cur = node.right;
            while (cur.left != null)
                cur = cur.left;
            return cur;
        }

        if (node.parent == null) return null;

        // 无右子树时  若其为其父节点的左子节点则找到其父节点即可
        if (node.parent.left.equals(node))
            return node.parent;

        // 若无右子树其为父节点的右子节点 向上查找直到找到自己为父节点的左子节点的祖先节点
        while (cur.parent != null) {
            if (cur.parent.left.equals(cur)) return cur.parent;
            cur = cur.parent;
        }

        return null;
    }
}
