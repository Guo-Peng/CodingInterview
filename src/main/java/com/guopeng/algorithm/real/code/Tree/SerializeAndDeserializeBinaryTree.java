package com.guopeng.algorithm.real.code.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by guopeng on 2017/4/23.
 */
public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "null";
        StringBuffer stringBuffer = new StringBuffer();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.remove();
            if (tmp == null) {
                count++;
                stringBuffer.append("null,");
                continue;
            } else {
                count = 0;
                stringBuffer.append(tmp.val);
                stringBuffer.append(",");
            }
            queue.add(tmp.left);
            queue.add(tmp.right);
        }

        return stringBuffer.substring(0, stringBuffer.length() - 5 * count - 1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("null")) return null;
        String[] node = data.split(",");

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(node[0]));
        queue.add(root);
        for (int i = 1; i < node.length; ) {
            TreeNode tmp = queue.remove();
            tmp.left = deserializeNode(node[i++]);
            if (i == node.length) break;
            tmp.right = deserializeNode(node[i++]);

            if (tmp.left != null) queue.add(tmp.left);
            if (tmp.right != null) queue.add(tmp.right);
        }
        return root;
    }

    private TreeNode deserializeNode(String node) {
        if (node.equals("null"))
            return null;
        else
            return new TreeNode(Integer.valueOf(node));
    }
}
