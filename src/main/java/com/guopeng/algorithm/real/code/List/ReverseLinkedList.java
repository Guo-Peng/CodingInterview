package com.guopeng.algorithm.real.code.List;

/**
 * Created by guopeng on 17-5-3.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode start = head, end = head.next;

        while (end != null) {
            start.next = end.next;
            end.next = head;
            head = end;
            end = start.next;
        }

        return head;
    }

    public ListNode reverseListRec(ListNode head) {
        if (head == null) return head;

        return reverse(head, head, head.next);
    }

    private ListNode reverse(ListNode head, ListNode start, ListNode end) {
        if (end == null) return head;

        start.next = end.next;
        end.next = head;
        return reverse(end, start, start.next);
    }
}
