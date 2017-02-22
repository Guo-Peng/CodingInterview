package com.guopeng.algorithm.codeinterview.chapter3;

import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;

/**
 * Created by guopeng on 2017/2/10.
 */
public class ListMerge {
    /**
     * 合并两个递增排序的链表
     *
     * @param head1
     * @param head2
     * @return
     */
    public ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        ListNode result = null;
        if (head1.value > head2.value) {
            result = head2;
            result.next = merge(head1, head2.next);
        } else {
            result = head1;
            result.next = merge(head1.next, head2);
        }
        return result;
    }
}
