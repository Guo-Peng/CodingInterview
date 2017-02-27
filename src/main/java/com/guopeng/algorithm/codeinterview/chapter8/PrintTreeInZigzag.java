package com.guopeng.algorithm.codeinterview.chapter8;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

import java.util.Stack;

/**
 * Created by guopeng on 2017/2/27.
 */
public class PrintTreeInZigzag {
    /**
     * 之字形打印树
     *
     * @param root
     * @return
     * @comment 先弹出节点的正下方节点被后访问到，所以使用栈保存下一层子节点，奇数层从右至左放子节点，偶数层从左至右放子节点
     * 由于一层遍历结束才能遍历下一层故需要两个栈
     */
    public String printTreeInZigzag(BinaryTreeNode root) {
        Stack<BinaryTreeNode>[] stacks = (Stack<BinaryTreeNode>[]) new Stack[]{new Stack<BinaryTreeNode>(), new Stack<BinaryTreeNode>()};

        String result = "";

        BinaryTreeNode cur = null;
        int flag = 0;
        stacks[flag].push(root);

        while (!stacks[flag].isEmpty()) {
            int n = stacks[flag].size();

            for (int i = 0; i < n; i++) {
                cur = stacks[flag].pop();
                result += cur.value;
                if (flag == 0) {
                    if (cur.left != null) stacks[1 - flag].push(cur.left);
                    if (cur.right != null) stacks[1 - flag].push(cur.right);
                } else {
                    if (cur.right != null) stacks[1 - flag].push(cur.right);
                    if (cur.left != null) stacks[1 - flag].push(cur.left);
                }
            }
            flag = 1 - flag;
        }
        return result;
    }
}
