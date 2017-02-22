package com.guopeng.algorithm.codeinterview.chapter4;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by guopeng on 2017/2/14.
 */
public class PrintFromTopToBottom {
    /**
     * 广度优先遍历二叉树
     * 使用队列
     *
     * @param root
     * @return
     */
    public String printFromTopToBottom(BinaryTreeNode root) {
        if (root == null) return "";

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        String result = "";

        while (queue.size() != 0) {
            result += offerSubNode(queue);
        }

        return result;
    }

    private int offerSubNode(Queue<BinaryTreeNode> queue) {
        BinaryTreeNode root = queue.poll();
        if (root.left != null) queue.offer(root.left);
        if (root.right != null) queue.offer(root.right);
        return root.value;
    }
}
