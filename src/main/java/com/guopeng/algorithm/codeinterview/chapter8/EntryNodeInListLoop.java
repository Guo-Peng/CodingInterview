package com.guopeng.algorithm.codeinterview.chapter8;

import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;

/**
 * Created by guopeng on 2017/2/25.
 */
public class EntryNodeInListLoop {
    /**
     * 找到链表环的入口节点
     *
     * @param head
     * @return
     * @comment 前一个指针速度为2，后一个为1，二者相遇则存在环且该节点在环之内，继续遍历并计数等再次到该节点则得到环中节点个数
     * 从头到环的首节点需要N步或者N -1 - ( n -1 ) = N-n  n-1为环首节点到末尾的次数
     * 一个指针先走n然后和后移同时走，二者走N-n步时，一个走了N 一个走了N-n,二者相遇与环首节点
     */
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
