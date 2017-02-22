package com.guopeng.algorithm.codeinterview.chapter2;

import java.util.Stack;

/**
 * Created by guopeng on 2017/2/1.
 */
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }

    public static ListNode constructList(int[] values) {
        if (values == null) return null;

        ListNode head = null;
        ListNode next = null;
        for (int value : values) {
            if (head == null) {
                head = new ListNode(value);
                next = head;
            } else {
                next.next = new ListNode(value);
                next = next.next;
            }
        }
        return head;
    }
}

public class ListReversePrint {
    /**
     * 倒序打印链表
     *
     * @param head
     * @return
     * @comment 可循环可递归
     */
    public String listReversePrintRec(ListNode head) {
        if (head == null) return "";

        return listReversePrintRec(head.next) + head.value;
    }

    public String listReversePrint(ListNode head) {
        Stack<ListNode> list = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            list.push(cur);
            cur = cur.next;
        }

        String result = "";
        while (!list.empty()) {
            result += list.pop().value;
        }
        return result;
    }
}
