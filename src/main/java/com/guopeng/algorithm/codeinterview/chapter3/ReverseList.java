package com.guopeng.algorithm.codeinterview.chapter3;

import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;
import com.guopeng.algorithm.codeinterview.utils.LinkedList;

/**
 * Created by guopeng on 2017/2/10.
 */
public class ReverseList {
    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) return head;

        return reverseNode(null, head);
    }

    private ListNode reverseNode(ListNode before, ListNode cur) {
        ListNode after = cur.next;
        cur.next = before;

        if (after == null) return cur;

        return reverseNode(cur, after);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode start = head, next = head.next;
        while (next != null) {
            start.next = next.next;
            next.next = head;
            head = next;
            next = start.next;
        }

        return head;
    }
}
