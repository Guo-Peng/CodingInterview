package com.guopeng.algorithm.real.meituan;

import com.guopeng.algorithm.codeinterview.utils.LinkedList.ListNode;
import com.guopeng.algorithm.codeinterview.utils.LinkedList;

/**
 * Created by guopeng on 17-3-28.
 */
public class ListQuickSort {
    public static void listQuickSort(ListNode head, ListNode tail) {
        if (head == tail || head == null || head.next == tail) return;

        ListNode index = quickSort(head, tail);
//        System.out.println(String.format("head: %s,tail: %s,index: %s", head,tail,index));

        if (index.next != tail) listQuickSort(index.next, tail);
        if (head.next != index) listQuickSort(head, index);
    }

    private static ListNode quickSort(ListNode head, ListNode tail) {
        ListNode index = head;
        for (ListNode node = head.next; node != tail; node = node.next) {
            if (node.value <= head.value) {
                index = index.next;
                if (index != node) {
                    int value = index.value;
                    index.value = node.value;
                    node.value = value;
                }
            }
        }
        int value = index.value;
        index.value = head.value;
        head.value = value;

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        LinkedList list = new LinkedList();

        list.constructList(arr);
        listQuickSort(list.head, null);
        System.out.println(list.printList());

        arr = new int[]{5, 7, 4, 6, 9, 2, 1};
        list.constructList(arr);
        listQuickSort(list.head, null);
        System.out.println(list.printList());
    }
}
