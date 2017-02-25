package com.guopeng.algorithm.codeinterview.chapter8;

import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;

/**
 * Created by guopeng on 2017/2/25.
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode head) {
        if (head == null) return head;

        ListNode tmp = detectDuplication(head);
        while (head != null && !head.equals(tmp)) {
            if (!head.equals(tmp)) head = tmp;
            tmp = detectDuplication(head);
        }

        if (head == null) return head;

        ListNode second = head;
        ListNode first = head;

        while (first != null) {
            first = first.next;
            first = detectDuplication(first);
            second.next = first;
            second = second.next;
        }

        return head;
    }

    private ListNode detectDuplication(ListNode node) {
        if (node == null || node.next == null) return node;

        if (node.value == node.next.value)
            return detectDuplication(node.next.next);
        else return node;
    }
}
