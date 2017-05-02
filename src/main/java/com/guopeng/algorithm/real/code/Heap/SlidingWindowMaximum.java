package com.guopeng.algorithm.real.code.Heap;

import com.guopeng.algorithm.codeinterview.utils.Print;
import com.guopeng.algorithm.util.collection.MonotoneQueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by guopeng on 17-5-2.
 */
public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0) return new int[0];

        int n = nums.length;

        int[] result = new int[n - k + 1];
        MonotoneQueue queue = new MonotoneQueue(k);
        for (int i = 0; i < k - 1; i++)
            queue.add(nums[i]);

        for (int i = k - 1; i < n; i++)
            result[i - k + 1] = queue.add(nums[i]);

        return result;
    }

    public static int[] maxSlidingWindowII(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        Deque<Integer> queue = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && queue.peekFirst() < i - k + 1)
                queue.removeFirst();
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i])
                queue.removeLast();
            queue.add(i);
            if (i >= k - 1)
                result[i - k + 1] = nums[queue.peekFirst()];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        Print.arrPrint(maxSlidingWindow(arr, 3));
        Print.arrPrint(maxSlidingWindowII(arr, 3));
    }
}
