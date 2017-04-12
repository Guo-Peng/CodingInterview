package com.guopeng.algorithm.util.tree;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by guopeng on 2017/4/12.
 */
public class TreeDepth {
    public int cycTreeDepth(BinaryTreeNode root) {
        BinaryTreeNode mark = new BinaryTreeNode(-1);

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        BinaryTreeNode cur;
        int count = 0;
        while (!queue.isEmpty()) {
            queue.add(mark);
            while (true) {
                cur = queue.remove();
                if (cur == mark) break;

                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
            count++;
        }
        return count;
    }

    public int treeDepth(BinaryTreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(treeDepth(root.left), treeDepth(root.right));
    }
}
