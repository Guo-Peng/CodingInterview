package com.guopeng.algorithm.real.code.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by guopeng on 17-5-5.
 */
public class SlidingWindowMedian {
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<>();

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            addNum(nums[i]);

            if (i < k - 1) continue;
            if (i >= k) delete(nums[i - k]);
            result[i - k + 1] = findMedian();
        }
        return result;
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

    private void delete(int num) {
        if (num <= left.peek())
            left.remove(num);
        else right.remove(num);

        if (left.size() < right.size())
            left.add(right.remove());
        else if (left.size()-right.size()>1)
            right.add(left.remove());
    }

    public static void main(String[] args) {
        SlidingWindowMedian obj = new SlidingWindowMedian();

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        double[] result = obj.medianSlidingWindow(arr, 3);
//        for (double num : result)
//            System.out.println(num);

        obj = new SlidingWindowMedian();

        arr = new int[]{2147483647, 1, 2, 3, 4, 5, 6, 7, 2147483647};
        result = obj.medianSlidingWindow(arr, 2);
        for (double num : result)
            System.out.println(num);
    }
}
