package com.guopeng.algorithm.real.code.Heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by guopeng on 17-5-5.
 */
public class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {
        left.add(num);
        right.add(left.remove());
        if (left.size() < right.size())
            left.add(right.remove());
    }

    public double findMedian() {
        if (left.size() > right.size())
            return left.peek();
        else return ((double) left.peek() + right.peek()) / 2;
    }

    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();

        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int num : arr) {
            obj.addNum(num);
//            System.out.println(obj.findMedian());
        }

        obj = new MedianFinder();

        arr = new int[]{6, 10, 2, 6, 5, 0, 6};
        for (int num : arr) {
            obj.addNum(num);
        }
        System.out.println(obj.findMedian());
    }

}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */