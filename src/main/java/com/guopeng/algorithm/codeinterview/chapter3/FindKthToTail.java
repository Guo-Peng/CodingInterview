package com.guopeng.algorithm.codeinterview.chapter3;

import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;
import com.guopeng.algorithm.codeinterview.utils.LinkedList;

import java.util.Stack;

/**
 * Created by guopeng on 2017/2/10.
 */
public class FindKthToTail {
    public ListNode FindKthToTailReverse(LinkedList list, int k) throws Exception {
        if (list == null || list.head == null || k < 1) throw new Exception("Invalid Input");

        Stack<ListNode> reverseList = new Stack<>();
        ListNode cur = list.head;
        int count = 0;
        while (cur != null) {
            count++;
            reverseList.push(cur);
            cur = cur.next;
        }

        if (count < k) throw new Exception("list is not long enough");
        for (int i = 0; i < k - 1; i++) reverseList.pop();

        return reverseList.pop();
    }

    /**
     * 输出链表中倒数第k个节点
     *
     * @param list
     * @param k
     * @return
     * @throws Exception
     * @comment 一个指针遍历链表不能解决的问题可以使用两个步进不同的指针
     */
    public ListNode FindKthToTail(LinkedList list, int k) throws Exception {
        if (list == null || list.head == null || k < 1) throw new Exception("Invalid Input");

        ListNode cur = list.head;
        ListNode kth = list.head;

        for (int i = 0; i < k - 1; i++) {
            cur = cur.next;
            if (cur == null) throw new Exception("list is not long enough");
        }

        while (cur.next != null) {
            cur = cur.next;
            kth = kth.next;
        }

        return kth;
    }
}
