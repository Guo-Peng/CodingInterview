package com.guopeng.algorithm.codeinterview.chapter8;

import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;

/**
 * Created by guopeng on 2017/2/25.
 */
public class DeleteDuplication {
    /**
     * 删除链表中的重复节点
     *
     * @param head
     * @return
     * @comment 头结点可能重复故返回值声明为ListNode
     * 检测当前节点是否与后续重复，找到后续第一个不与其之后重复的节点
     * 当前节点为头结点则覆盖
     * second指向前一个节点 first指向second指向前一个节点后第一个不重复的节点
     */
    public ListNode deleteDuplication(ListNode head) {
        if (head == null) return head;

        ListNode tmp = detectDuplication(head);
        while (head != null && !head.equals(tmp)) {
            if (!head.equals(tmp)) head = tmp;
            tmp = detectDuplication(head);
        }

        if (head == null) return head;

        ListNode second = head;
        ListNode first = head;

        while (first != null) {
            first = first.next;
            first = detectDuplication(first);
            second.next = first;
            second = second.next;
        }

        return head;
    }

    private ListNode detectDuplication(ListNode node) {
        if (node == null || node.next == null) return node;

        if (node.value == node.next.value)
            return detectDuplication(node.next.next);
        else return node;
    }
}
