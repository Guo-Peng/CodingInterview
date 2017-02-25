package com.guopeng.algorithm.codeinterview.chapter8;

import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;

/**
 * Created by guopeng on 2017/2/25.
 */
public class EntryNodeInListLoop {
    public ListNode meetingNode(ListNode head) {
        if (head == null) return null;

        ListNode first = head;
        ListNode second = head;

        int loopNum = findLoop(head);
        if (loopNum == -1) return null;

        while (loopNum != 0) {
            first = first.next;
            loopNum--;
        }

        while (!first.equals(second)) {
            first = first.next;
            second = second.next;
        }

        return first;
    }

    private int findLoop(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        if (first.next == null) return -1;
        first = first.next.next;

        while (!first.equals(second)) {
            if (first == null || first.next == null || second == null) return -1;

            first = first.next.next;
            second = second.next;
        }

        first = first.next;
        int count = 1;
        while (!first.equals(second)) {
            first = first.next;
            count++;
        }

        return count;
    }
}
