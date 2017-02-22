package com.guopeng.algorithm.codeinterview.utils;

/**
 * Created by guopeng on 2017/2/9.
 */
public class LinkedList {
    public ListNode head;

    public LinkedList() {

    }

    public LinkedList(int value) {
        addToTail(value);
    }

    public LinkedList(int[] arr) {
        constructList(arr);
    }

    public void addToTail(int value) {
        ListNode node = new ListNode(value);

        if (head == null) head = node;
        else {
            ListNode cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = node;
        }
    }

    public void constructList(int[] arr) {
        head = null;

        for (int i : arr) addToTail(i);
    }

    public ListNode getNode(int value) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.value == value) break;
            else cur = cur.next;
        }
        return cur;
    }

    public String printList() {
        return printNode(head);
    }

    private String printNode(ListNode node) {
        if (node == null) return "";
        else return node.value + printNode(node.next);
    }

    public class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }
}
