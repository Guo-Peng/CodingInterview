package com.guopeng.algorithm.real.code.List;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by guopeng on 17-4-28.
 */
public class MergeKSortedLists {
    static class com implements Comparator<ListNode> {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new com());
        int count = 0;
        for (ListNode list : lists) {
            if (list != null) {
                queue.add(list);
                count++;
            }
        }
        if (count == 0) return null;

        ListNode head = queue.remove();
        ListNode cur = head;
        if (head.next != null) queue.add(head.next);
        else count--;
        while (count > 0) {
            ListNode tmp = queue.remove();
            cur.next = tmp;
            cur = tmp;
            if (tmp.next != null) queue.add(tmp.next);
            else count--;
        }
        return head;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        print(mergeKLists(new ListNode[1]));
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        print(mergeKLists(new ListNode[]{n1}));
    }
}
