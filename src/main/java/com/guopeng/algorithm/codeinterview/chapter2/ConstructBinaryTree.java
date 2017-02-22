package com.guopeng.algorithm.codeinterview.chapter2;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

/**
 * Created by guopeng on 2017/2/1.
 */


public class ConstructBinaryTree {
    /**
     * 根据前序及中序重新构建二叉树
     *
     * @param preOrder
     * @param inOrder
     * @return
     * @throws Exception
     * @comment 找到根节点的位置以确定 左子树及右子树 的前序及中序数组
     * 递归创建左子树及右子树
     */
    public BinaryTreeNode constructBinaryTree(int[] preOrder, int[] inOrder) throws Exception {
        if (preOrder == null || inOrder == null || preOrder.length == 0) return null;

        BinaryTreeNode root = new BinaryTreeNode(preOrder[0]);

        int leftNum = 0;
        int rightNum = 0;
        while (leftNum < preOrder.length && inOrder[leftNum] != preOrder[0]) {
            leftNum++;
        }
        rightNum = preOrder.length - 1 - leftNum;


        if (leftNum == preOrder.length) throw new Exception("Invalid Input");

        if (leftNum > 0) {
            int[] leftPreOrder = new int[leftNum];
            int[] leftInOrder = new int[leftNum];

            System.arraycopy(preOrder, 1, leftPreOrder, 0, leftNum);
            System.arraycopy(inOrder, 0, leftInOrder, 0, leftNum);

            root.left = constructBinaryTree(leftPreOrder, leftInOrder);
        }

        if (rightNum > 0) {
            int[] leftPreOrder = new int[rightNum];
            int[] leftInOrder = new int[rightNum];

            System.arraycopy(preOrder, leftNum + 1, leftPreOrder, 0, rightNum);
            System.arraycopy(inOrder, leftNum + 1, leftInOrder, 0, rightNum);

            root.right = constructBinaryTree(leftPreOrder, leftInOrder);
        }

        return root;
    }
}
