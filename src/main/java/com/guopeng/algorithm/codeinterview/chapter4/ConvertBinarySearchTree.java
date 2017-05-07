package com.guopeng.algorithm.codeinterview.chapter4;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/2/14.
 */
public class ConvertBinarySearchTree {
    /**
     * 将二叉搜索树转化为排序的双向链表
     *
     * @param root
     * @return 左子节点的二叉树值均小于该节点，左子节点转化完的最后一个节点应连接该节点，
     * 连接后的链表的最后一个节点应该连接右子树链表的第一个节点
     * <p>
     * 作为左叶子节点的节点不用更新lastNode，直接将其作为前一个节点
     * 作为右叶子节点的节点不用更新lastNode，其自身就是lastNode，将其返回即可
     */
    public BinaryTreeNode convert(BinaryTreeNode root) {
        if (root == null) return null;

        BinaryTreeNode lastNode = convertSubTree(root, null);

        while (lastNode.left != null) lastNode = lastNode.left;

        return lastNode;
    }

    private BinaryTreeNode convertSubTree(BinaryTreeNode root, BinaryTreeNode lastNode) {
        if (root == null) return lastNode;//左叶子节点为当前子树的最小节点，将其与前last连接
        lastNode = convertSubTree(root.left, lastNode); // 得到左子树转化后的最后一个节点

        root.left = lastNode;
        if (lastNode != null) lastNode.right = root;

        lastNode = root;
        return convertSubTree(root.right, lastNode);
    }

    public String printList(BinaryTreeNode root) {
        if (root == null) return "";

        String result = "";
        while (root != null) {
//            if (root.left != null)
//                result += String.format("(%s) ", root.left.value);
            result += root.value + " ";
//            if (root.right != null)
//                result += String.format("(%s),", root.right.value);
            root = root.right;
        }

        return result.substring(0, result.length() - 1);
    }
}
