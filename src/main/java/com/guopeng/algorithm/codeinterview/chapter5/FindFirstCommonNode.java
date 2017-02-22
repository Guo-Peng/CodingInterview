package com.guopeng.algorithm.codeinterview.chapter5;

import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;

/**
 * Created by guopeng on 2017/2/17.
 */
public class FindFirstCommonNode {
    /**
     * 找到链表的第一个公共节点
     *
     * @param head1
     * @param head2
     * @return
     * @comment 公共节点及之后完全相同，由于链表长度不同可能需要走不同的次数才能到达公共节点
     * 让长的链表先走多出的部分然后共同移动直到找到第一个公共节点
     */
    public ListNode findFirstCommonNode(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) return null;

        int length1 = listLength(head1);
        int length2 = listLength(head2);

        ListNode cur1 = head1;
        ListNode cur2 = head2;
        if (length1 > length2) cur1 = findNthNode(cur1, length1 - length2);
        else if (length2 > length1) cur2 = findNthNode(cur2, length2 - length1);

        for (int i = 0; i < Math.min(length1, length2); i++) {
            if (cur1 == cur2) return cur1;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return null;
    }

    private int listLength(ListNode head) {
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }

    private ListNode findNthNode(ListNode head, int n) {
        for (int i = 0; i < n; i++)
            head = head.next;
        return head;
    }
}
