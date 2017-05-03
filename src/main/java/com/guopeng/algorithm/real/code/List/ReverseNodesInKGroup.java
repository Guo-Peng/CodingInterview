package com.guopeng.algorithm.real.code.List;

/**
 * Created by guopeng on 17-5-3.
 */
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k < 2) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int l = 0;
        for (ListNode tmp = dummy; tmp.next != null; tmp = tmp.next)
            l++;

        ListNode pre = dummy;
        for (int i = 0; i < l / k; i++) {
            pre = reverse(pre, k);
        }

        return dummy.next;
    }

    private ListNode reverse(ListNode pre, int k) {
        ListNode start = pre.next;
        ListNode end = start.next;
        for (int i = 0; i < k - 1; i++) {
            start.next = end.next;
            end.next = pre.next;
            pre.next = end;
            end = start.next;
        }

        return start;
    }
}
