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
     * 先计算一个立柱的面积
     * 然后计算以i为起点的两个立柱面积
     * 依次类推至长度为n-1
     * 复杂度o(n^2)
     * 超时
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

    /**
     * 矩形必然以某一立柱的高度为边
     * 遍历矩形并将其左右扩展,左右高度必须大于等于当前立柱高度
     * 复杂度o(n^2)
     * 超时
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea2(int[] heights) {
        int n = heights.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int l = i - 1; l >= 0 && heights[l] >= heights[i]; l--)
                count++;
            for (int r = i + 1; r < n && heights[r] >= heights[i]; r++)
                count++;
            if (heights[i] * count > max) max = heights[i] * count;
        }
        return max;
    }

    public int largestRectangleArea3(int[] heights) {
        int n = heights.length;

        Stack<Integer> index = new Stack<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (!(index.empty() || heights[i] >= heights[index.peek()])) {
                while (!index.empty() && heights[i] < heights[index.peek()]) {
                    int top = index.pop();
                    int area = (index.empty() ? i : (i - index.peek() - 1)) * heights[top];
                    if (area > max) max = area;
                }
            }
            index.push(i);
        }

        while (!index.empty()) {

            int top = index.pop();
            int area = (index.empty() ? n : (n - index.peek() - 1)) * heights[top];
            if (area > max) max = area;
        }
        return max;
    }

    /**
     * 只入栈递增序列，索引为i时出现递减则将所有高度大于h[i]的出栈
     * 出栈部分的序列中的立柱向两侧扩展的范围仅限于序列之中，之外的立柱都比他们低的所隔开
     * 因此出栈的序列即是求解最大矩形的孤岛，它们不会干扰到外部
     * 出栈的部分的最大面积即为(i-k_before )*h[k],k为出栈的索引
     * 矩形宽度使用当前所以i与栈顶的索引得到，因为出栈元素与栈顶元素之间可能还有其他元素并且已经出栈，出栈代表它们比当前出栈元素更小，宽度要算入其中
     * 栈为空则代表当前的栈的第一个立柱要低于0 - i-1的所有立柱，因此其面积为i*h[k]
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= len; i++) {
            int h = (i == len ? 0 : heights[i]); // 数组末尾添加0保证最后全部出栈进行计算，之前有0并不影响
            if (s.isEmpty() || h >= heights[s.peek()]) {
                s.push(i);
            } else {
                int tp = s.pop();
                // 注意栈为空的情况
                // 注意矩形宽度的计算，出栈元素与栈顶之间可能还有其他元素，这些元素都大于当前出栈元素
                maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--; // 保证i不变直到出栈顶的立柱低于当前立柱
            }
        }
        return maxArea;
    }
}
