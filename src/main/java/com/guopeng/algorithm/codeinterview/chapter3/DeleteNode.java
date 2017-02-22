package com.guopeng.algorithm.codeinterview.chapter3;

import com.guopeng.algorithm.codeinterview.utils.LinkedList;
import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;

/**
 * Created by guopeng on 2017/2/9.
 */
public class DeleteNode {
    /**
     * o(1)时间内删除链表节点
     *
     * @param list
     * @param toBeDeleted
     * @throws Exception
     * @comment 删除节点可将下个节点拷贝过来并删除下一个节点
     * 若要删除的为首节点则直接删除
     * 要删除的为尾节点则仍需遍历
     * 此时不能判别要删除的节点是否存在于链表内
     */
    public void deleteNode(LinkedList list, ListNode toBeDeleted) throws Exception {
        if (list == null || toBeDeleted == null) throw new Exception("Invalid Input");

        if (toBeDeleted.equals(list.head)) {
            list.head = toBeDeleted.next;
        } else if (toBeDeleted.next == null) {
            ListNode cur = list.head;
            while (cur.next.next != null) cur = cur.next;
            cur.next = null;
        } else {
            toBeDeleted.value = toBeDeleted.next.value;
            toBeDeleted.next = toBeDeleted.next.next;
        }
    }
}
