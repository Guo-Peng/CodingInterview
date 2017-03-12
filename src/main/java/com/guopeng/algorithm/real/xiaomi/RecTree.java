package com.guopeng.algorithm.real.xiaomi;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

import java.util.Stack;

/**
 * Created by guopeng on 2017/3/12.
 */
public class RecTree {
    public String preOrder(BinaryTreeNode root) {
        if (root == null) return "";

        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        BinaryTreeNode cur;
        String result = "";
        while (!stack.empty()) {
            cur = stack.pop();
            result += cur.value;
            if (cur.right != null) stack.push(cur.right);
            if (cur.left != null) stack.push(cur.left);
        }
        return result;
    }

    public String inOrder(BinaryTreeNode root) {
        if (root == null) return "";

        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode cur = root;
        String result = "";
        while (!stack.empty()) {
            if (cur.left!=null) stack.push(cur.left);
            stack.push(cur);
            if (cur.right != null) stack.push(cur.right);
        }
        return result;
    }

    public String postOrder(BinaryTreeNode root) {
        if (root == null) return "";

        return postOrder(root.left) + postOrder(root.right) + root.value;
    }
}
