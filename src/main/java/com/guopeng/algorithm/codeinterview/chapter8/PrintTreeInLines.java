package com.guopeng.algorithm.codeinterview.chapter8;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by guopeng on 2017/2/27.
 */
public class PrintTreeInLines {
    /**
     * 按行打印树
     *
     * @param root
     * @return
     * @comment 先访问的节点的子节点在同一层也被先访问，先入先出，一层遍历结束再遍历下一层
     * 使用队列保存节点，访问前保存该层子节点的数目
     */
    public String printTreeInLines(BinaryTreeNode root) {
        String result = "";
        Queue<BinaryTreeNode> queue = new LinkedList<>();

        queue.offer(root);
        BinaryTreeNode cur = null;

        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                cur = queue.poll();
                result += cur.value;

                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
        }

        return result;
    }
}
