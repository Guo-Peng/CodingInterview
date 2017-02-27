package com.guopeng.algorithm.codeinterview.chapter8;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by guopeng on 2017/2/27.
 */
public class PrintTreeInLines {
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
