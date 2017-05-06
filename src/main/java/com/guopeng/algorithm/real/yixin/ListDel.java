package com.guopeng.algorithm.real.yixin;

import com.guopeng.algorithm.real.code.List.ListNode;

/**
 * Created by guopeng on 2017/5/6.
 */
public class ListDel {
    public static ListNode del(ListNode head, int target) {
        if (head == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head, pre = dummy;
        while (cur != null) {
            if (cur.val == target) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = pre.next;
        }

        return dummy.next;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        print(del(n1, 1));
//        print(del(n1, 0));


    }
}
