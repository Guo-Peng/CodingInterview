package com.guopeng.algorithm.util.collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by guopeng on 17-4-25.
 */
public class MonotoneQueue {
    private Deque<Node> deque;
    private boolean increase = false;
    private int k;
    private int cur = 0;

    private class Node {
        int value;
        int index;

        Node(int value) {
            this.value = value;
            index = cur;
        }
    }

    public MonotoneQueue(int k) {
        this.k = k;
        deque = new LinkedList<>();
    }

    public void setOrder(boolean increase) {
        this.increase = increase;
    }

    public int add(int value) {
        if (increase) value = -value;

        Node node = new Node(value);
        while (!deque.isEmpty() && deque.peekLast().value <= value)
            deque.removeLast();

        deque.addLast(node);
        if ((cur - deque.peekFirst().index + 1) > k)
            deque.removeFirst();

        int result = deque.peekFirst().value;
        cur++;
        return increase ? -result : result;
    }

    public static void main(String[] args) {
        MonotoneQueue queue = new MonotoneQueue(3);
//        queue.setOrder(true);
        int[] arr = {8, 7, 12, 5, 16, 9, 17, 2, 4, 6};
        for (int num : arr) {
            System.out.println(queue.add(num));
        }
    }

}
