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
        for (ListNode list : lists) {
            if (list != null) queue.add(list);
        }
        if (queue.isEmpty()) return null;

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!queue.isEmpty()) {
            ListNode tmp = queue.remove();
            cur.next = tmp;
            cur = tmp;
            if (tmp.next != null) queue.add(tmp.next);
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
        print(mergeKLists(new ListNode[1]));
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        print(mergeKLists(new ListNode[]{n1}));

        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(3);
        q.add(5);
        q.add(2);
        System.out.println(q);
    }
}
