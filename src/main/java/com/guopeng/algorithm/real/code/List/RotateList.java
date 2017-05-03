package com.guopeng.algorithm.real.code.List;


/**
 * Created by guopeng on 17-5-3.
 */
public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode last = head;
        int l = 1;
        for (; last.next != null; l++) {
            last = last.next;
        }

        ListNode cur = head;
        for (int i = 0; i < (l - (k % l)) - 1; i++) {
            cur = cur.next;
        }

        last.next = head;
        head = cur.next;
        cur.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        System.out.println(rotateRight(n1, 0).val);
    }
}
