package com.guopeng.algorithm.real.toutiao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guopeng on 17-4-1.
 */
public class Peek {
    public static int peek(int[] arr) {
        if (arr == null || arr.length <= 2) return -1;

        int n = arr.length;
        int mStart = -1, mEnd = -1, max = 0;

        for (int start = 0, end = 0; end < n - 1; ) {
            while (start < n - 1 && arr[start] > arr[start + 1])
                start++;
            if (start >= n - 2) break;

            end = start;
            while (end < n - 1 && arr[end] < arr[end + 1])
                end++;
            if (end == n - 1) break;

            while (end < n - 1 && arr[end] > arr[end + 1])
                end++;

            if (end - start > max) {
                mStart = start;
                mEnd = end;
                max = end - start;
            }

            start = end;
        }
        System.out.println(String.format("start: %d,end: %d", mStart, mEnd));
        return max;
    }

    public static int[] getLongestPeak(int[] nums) {
        List<Integer> footList = new ArrayList<>();
        footList.add(0);
        List<Integer> peakList = new ArrayList<>();
        int foot = 1;
        while (foot < nums.length - 1) {
            if (nums[foot] < nums[foot + 1] && nums[foot] < nums[foot - 1]) {
                footList.add(foot);
            } else if (nums[foot] > nums[foot + 1] && nums[foot] > nums[foot - 1]) {
                peakList.add(foot);
            }
            foot++;
        }
        footList.add(nums.length - 1);
        int maxLength = -1;
        int pos1 = -1;
        int pos2 = -1;
        for (int i = 0; i < footList.size() - 1; i++) {
            int length = footList.get(i + 1) - footList.get(i) + 1;
            if (length > maxLength) {
                for (int j : peakList) {
                    if (j > footList.get(i) && j < footList.get(i + 1)) {
                        maxLength = length;
                        pos1 = footList.get(i);
                        pos2 = footList.get(i + 1);
                    }
                }
            }
        }
        int[] result = new int[2];
        result[0] = pos1;
        result[1] = pos2;
        System.out.println(String.format("start: %d,end: %d", pos1, pos2));
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 2, 5, 4, 3, 1, 9, 10};
        peek(arr);
        getLongestPeak(arr);

        arr = new int[]{1, 2, 3, 4};
        peek(arr);
        getLongestPeak(arr);

        arr = new int[]{3, 4, 5, 6, 7, 8, 1};
        peek(arr);
        getLongestPeak(arr);

        arr = new int[]{5, 4, 6, 2, 1, 2, 3, 5, 3};
        peek(arr);
        getLongestPeak(arr);
    }
}
