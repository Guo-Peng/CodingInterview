package com.guopeng.algorithm.real.code.Tree;

import com.guopeng.algorithm.real.code.List.ListNode;

/**
 * Created by guopeng on 2017/5/7.
 */
public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;

        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        return convert(head, len);
    }

    private TreeNode convert(ListNode head, int len) {
        if (len <= 0) return null;

        int mid = len / 2;
        ListNode cur = head;
        for (int i = 0; i < mid; i++)
            cur = cur.next;

        TreeNode root = new TreeNode(cur.val);
        root.left = convert(head, mid);
        root.right = convert(cur.next, len - mid - 1);
        return root;
    }
}
