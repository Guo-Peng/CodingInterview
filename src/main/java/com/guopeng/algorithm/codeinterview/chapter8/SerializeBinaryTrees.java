package com.guopeng.algorithm.codeinterview.chapter8;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/3/10.
 */
public class SerializeBinaryTrees {
    public String serialize(BinaryTreeNode root) {
        if (root == null) return "$";

        return root.value + "," + serialize(root.left) + "," + serialize(root.right);
    }

    public BinaryTreeNode deserialize(String serialize) {
        return null;
    }
}
