package com.guopeng.algorithm.codeinterview.chapter7;

import com.guopeng.algorithm.codeinterview.utils.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by guopeng on 2017/2/25.
 */
public class GetLastCommonParent {
    /**
     * 找到两个节点的最低公共祖先
     *
     * @param root
     * @param node1
     * @param node2
     * @return
     * @comment 先找到两个节点的路径，然后问题退化为找到路径的最后一个不同的节点(队列)，找到路径的第一相同节点(栈)
     * 如果为二叉搜索树：当前节点大于二者则在左子树中寻找，小于二者则在右子树中寻找，介于二者则返回该节点即可
     * 如果含有指向父节点的链接则退化为找到链表的第一个公共节点
     */
    public BinaryTreeNode getLastCommonParent(BinaryTreeNode root, BinaryTreeNode node1, BinaryTreeNode node2) {
        if (root == null || node1 == null || node2 == null) return null;

        Queue<BinaryTreeNode> path1 = getNodePath(root, node1, new LinkedList<BinaryTreeNode>());
        Queue<BinaryTreeNode> path2 = getNodePath(root, node2, new LinkedList<BinaryTreeNode>());
        if (path1 == null || path2 == null) return null;

        return getLastCommonNode(path1, path2);
    }

    private Queue<BinaryTreeNode> getNodePath(BinaryTreeNode root, BinaryTreeNode node, Queue<BinaryTreeNode> path) {
        if (root == null) return null;

        path.offer(root);

        if (root.equals(node)) return path;

        Queue<BinaryTreeNode> result = getNodePath(root.left, node, path);
        if (result == null) result = getNodePath(root.right, node, path);
        if (result == null) path.poll();

        return result;
    }

    private BinaryTreeNode getLastCommonNode(Queue<BinaryTreeNode> path1, Queue<BinaryTreeNode> path2) {
        BinaryTreeNode result = path1.peek();
        while (path1.size() != 0 && path2.size() != 0) {
            if (!path1.peek().equals(path2.peek())) return result;
            else {
                result = path1.poll();
                path2.poll();
            }
        }
        return result;
    }
}
