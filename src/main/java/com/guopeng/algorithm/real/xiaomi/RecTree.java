package com.guopeng.algorithm.real.xiaomi;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

import java.util.Stack;

/**
 * Created by guopeng on 2017/3/12.
 */
public class RecTree {
    /**
     * 循环遍历树
     *
     * @param root
     * @return
     * @comment 循环遍历左子节点直到左子节点为空
     * 不断出栈直到找到右子节点不为空的父节点，令右子节点为当前节点并重复上面 操作
     * 出栈顺序为中序
     * 入栈顺序为先序
     */
    public String preOrder(BinaryTreeNode root) {
        if (root == null) return "";

        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode cur = root;

        String result = "";
        while (!stack.empty() || cur != null) {
            result += cur.value;

            stack.push(cur);
            cur = cur.left;

            while (cur == null && !stack.isEmpty()) {
                cur = stack.pop();
                cur = cur.right;
            }
        }
        return result;
    }

    public String inOrder(BinaryTreeNode root) {
        if (root == null) return "";

        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode cur = root;

        String result = "";
        while (!stack.empty() || cur != null) {
            stack.push(cur);
            cur = cur.left;

            while (cur == null && !stack.isEmpty()) {
                cur = stack.pop();
                result += cur.value;
                cur = cur.right;
            }
        }
        return result;
    }

    public String postOrder(BinaryTreeNode root) {
        if (root == null) return "";

        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);

        BinaryTreeNode pre = null;
        BinaryTreeNode cur;

        String result = "";
        while (!stack.empty()) {
            cur = stack.peek();
            if (cur.left == null && cur.right == null ||
                    (pre != null && (pre.equals(cur.left) ||pre.equals( cur.right)))) {
                result += stack.pop().value;
                pre = cur;
            } else {
                if (cur.right != null) stack.push(cur.right);
                if (cur.left != null) stack.push(cur.left);
            }
        }
        return result;
    }
}
