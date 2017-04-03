package com.guopeng.algorithm.util;

import com.guopeng.algorithm.codeinterview.utils.Print;

/**
 * Created by guopeng on 2017/4/3.
 */
public class BucketSort {
    class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public int[] bucketSort(int[] arr, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        float space = (max - min + 1) / (float) k;
        Node[] bockets = new Node[k];

        for (int num : arr) {
            int index = (int) Math.floor((num - min) / space);
            if (bockets[index] == null) {
                bockets[index] = new Node(num);
            } else {
                Node head = bockets[index];
                Node cur = new Node(num);
                if (num < head.value) {
                    bockets[index] = cur;
                    cur.next = head;
                } else {
                    while (head.next != null && head.next.value <= num)
                        head = head.next;
                    cur.next = head.next;
                    head.next = cur;
                }
            }
        }

        int index = 0;
        for (int i = 0; i < k; i++) {
            Node cur = bockets[i];
            if (cur == null) continue;
            while (cur != null) {
                arr[index++] = cur.value;
                cur = cur.next;
            }
        }
        return arr;
    }

}
