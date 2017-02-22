package com.guopeng.algorithm.codeinterview.chapter4;

import com.guopeng.algorithm.codeinterview.utils.ComplexListNode;

/**
 * Created by guopeng on 2017/2/14.
 */
public class CopyComplexList {
    /**
     * 复杂链表的复制  *****
     * 复杂链表包含指向任意节点的slibling指针
     *
     * @param head
     * @return
     * @comment solution1 先复制链表基本结构，针对每一节点的slibling，从head开始遍历以完成复制 o(n^2)
     * <p>
     * solution 2 复制链表基本结构时保存一份源节点到clone节点的元组(n,n'),复制slibling通过查表得到 通过空间换取时间
     * <p>
     * solution 3 先复制链表结构同时将n'放至n之后，偶数为clone链表，奇数为原始链表
     * 复制slibling只需找到n的slibling的下一个元素即可
     * 最后将链表拆分，注意最后一个元素的下一个元素是否为null
     * 时间复杂度为o(n)
     */
    public ComplexListNode copyComplexList(ComplexListNode head) {
        if (head == null) return head;
        cloneNodes(head);
        connectSliblingNodes(head);
        return reconnectNodes(head);
    }

    private void cloneNodes(ComplexListNode head) {
        ComplexListNode cur = head;
        while (cur != null) {
            ComplexListNode curClone = cur.cloneWithValue();
            curClone.next = cur.next;
            cur.next = curClone;

            cur = cur.next.next;
        }
    }

    private void connectSliblingNodes(ComplexListNode head) {
        ComplexListNode cur = head;
        while (cur != null) {
            if (cur.slibling != null) {
                cur.next.slibling = cur.slibling.next;
            }
            cur = cur.next.next;
        }
    }

    private ComplexListNode reconnectNodes(ComplexListNode head) {
        ComplexListNode cur = head;
        ComplexListNode curClone = head.next;
        ComplexListNode headClone = head.next;

        while (cur != null) {
            cur.next = cur.next.next;
            if (curClone.next != null)
                curClone.next = curClone.next.next;

            cur = cur.next;
            curClone = curClone.next;
        }
        return headClone;
    }
}
