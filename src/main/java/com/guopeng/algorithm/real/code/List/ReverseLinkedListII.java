package com.guopeng.algorithm.real.code.List;

/**
 * Created by guopeng on 2017/4/21.
 */
public class ReverseLinkedListII {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return head;
        ListNode h = new ListNode(-1);
        h.next = head;
        ListNode pre = h;

        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }

        ListNode cur, next;
        cur = pre.next;
        next = cur.next;

        for (int i = 0; i < n - m; i++) {
            ListNode tmp = cur;
            cur = next;
            next = next.next;
            cur.next = tmp;
        }

        pre.next.next = next;
        pre.next = cur;

        return h.next;
    }

    public static void print(ListNode head) {
        StringBuffer stringBuilder = new StringBuffer();
        while (head != null) {
            stringBuilder.append(head.val);
            head = head.next;
        }

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;

//        print(reverseBetween(n1, 1, 1));

        n1.next = n2;
        n2.next = n3;
//        print(reverseBetween(n1, 2, 2));

        n1.next = n2;
        n2.next = null;
        print(reverseBetween(n1, 1, 2));
    }
}
