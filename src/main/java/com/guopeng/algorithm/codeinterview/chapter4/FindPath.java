package com.guopeng.algorithm.codeinterview.chapter4;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

import java.util.Stack;

/**
 * Created by guopeng on 2017/2/14.
 */
public class FindPath {
    /**
     * 打印二叉树路径中节点值和为给定值的路径
     *
     * @param root
     * @param exceptedSum
     * @comment 前序遍历二叉树，遍历过程中压栈
     * 遇到子节点且符合时打印
     * 回退时出栈
     */
    public void findPath(BinaryTreeNode root, int exceptedSum) {
        if (root == null || root.value > exceptedSum) return;

        findSubPath(root, exceptedSum, new Stack<>());
    }

    private void findSubPath(BinaryTreeNode root, int exceptedSum, Stack<Integer> path) {
        if (root == null || exceptedSum < 0) {
            return;
        }

        path.push(root.value);
        if (root.left == null && root.right == null && root.value == exceptedSum) {
            System.out.println(String.format("right path: %s", path.toString()));
            path.pop();
            return;
        }

        findSubPath(root.left, exceptedSum - root.value, path);
        findSubPath(root.right, exceptedSum - root.value, path);
        path.pop();
    }
}
