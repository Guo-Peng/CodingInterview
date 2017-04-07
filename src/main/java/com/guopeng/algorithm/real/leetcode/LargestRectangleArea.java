package com.guopeng.algorithm.real.leetcode;

import java.util.Stack;

/**
 * Created by guopeng on 2017/4/7.
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1,
 * find the area of largest rectangle in the histogram.
 */
public class LargestRectangleArea {
    /**
     * 计算子数组的最大面积，不断扩张
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea1(int[] heights) {
        int n = heights.length;

        int max = 0;
        int[] area = new int[n];
        for (int i = 0; i < n; i++) {
            area[i] = heights[i];
            if (area[i] > max) max = area[i];
        }

        for (int l = 2; l <= n; l++) {
            for (int i = 0; i < n - l + 1; i++) {
                int min = Math.min(heights[i + l - 1], area[i] / (l - 1));
                area[i] = min * l;
                if (area[i] > max) max = area[i];
            }
        }

        return max;
    }

    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= len; i++) {
            int h = (i == len ? 0 : heights[i]);
            if (s.isEmpty() || h >= heights[s.peek()]) {
                s.push(i);
            } else {
                int tp = s.pop();
                maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}
