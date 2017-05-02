package com.guopeng.algorithm.util.collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by guopeng on 17-5-2.
 */
public class MaxQueue {
    private Deque<Integer> deque;
    private boolean increase = false;
    private int k;
    private int[] arr;

    public MaxQueue(int k, int[] arr) {
        this.k = k;
        this.arr = arr;
        deque = new LinkedList<>();
    }

    public void setOrder(boolean increase) {
        this.increase = increase;
    }

    public int add(int i) {
        while (!deque.isEmpty() && deque.peekFirst() < i - k + 1)
            deque.removeFirst();
        while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i])
            deque.removeLast();

        deque.add(i);
        return arr[deque.peekFirst()];
    }
}
