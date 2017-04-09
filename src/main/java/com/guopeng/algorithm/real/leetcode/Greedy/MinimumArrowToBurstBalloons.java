package com.guopeng.algorithm.real.leetcode.Greedy;

import java.util.*;

/**
 * Created by guopeng on 2017/4/9.
 * There are a number of spherical balloons spread in two-dimensional space. For each balloon,
 * provided input is the start and end coordinates of the horizontal diameter. Since it's horizontal,
 * y-coordinates don't matter and hence the x-coordinates of start and end of the diameter suffice.
 * Start is always smaller than end. There will be at most 104 balloons.
 * <p>
 * An arrow can be shot up exactly vertically from different points along the x-axis.
 * A balloon with xstart and xend bursts by an arrow shot at x if xstart ≤ x ≤ xend.
 * There is no limit to the number of arrows that can be shot.
 * An arrow once shot keeps travelling up infinitely.
 * The problem is to find the minimum number of arrows that must be shot to burst all balloons.
 * <p>
 * Input:
 * [[10,16], [2,8], [1,6], [7,12]]
 * <p>
 * Output:
 * 2
 * <p>
 * Explanation:
 * One way is to shoot one arrow for example at x = 6 (bursting the balloons [2,8] and [1,6]) and
 * another arrow at x = 11 (bursting the other two balloons).
 */
public class MinimumArrowToBurstBalloons {
    /**
     * 从左至右移动垂线，当垂线遇到第一个右边界时必须进行一次切割
     * right使用优先队列存储右边界
     * left使用map存储左右边界，value为list
     * 切割时遍历小于当前右边界的左边界并删除其对应的右边界
     * 边界不能用set，因为从左边界寻找右边界时会误删
     * o(n^2) 超时
     *
     * @param points
     * @return
     */
    public int findMinArrowShots1(int[][] points) {
        PriorityQueue<Integer> right = new PriorityQueue<>();
        TreeMap<Integer, ArrayList<Integer>> left = new TreeMap<>();

        for (int i = 0; i < points.length; i++) {
            right.add(points[i][1]);
            if (!left.containsKey(points[i][0]))
                left.put(points[i][0], new ArrayList<>());
            left.get(points[i][0]).add(points[i][1]);
        }

        int count = 0;
        while (!right.isEmpty()) {
            int minRight = right.peek();
            count++;
            HashSet<Integer> remove = new HashSet<>();
            for (int l : left.keySet()) {
                if (l <= minRight)
                    for (int r : left.get(l))
                        right.remove(r);
                else
                    break;
                remove.add(l);
            }
            for (int l : remove)
                left.remove(l);
        }
        return count;
    }

    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0 || points[0].length == 0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        int minArrows = 1;
        int arrowLimit = points[0][1];
        for (int i = 1; i < points.length; i++) {
            int[] balloon = points[i];
            if (balloon[0] <= arrowLimit) {
                arrowLimit = Math.min(arrowLimit, balloon[1]);
            } else {
                minArrows++;
                arrowLimit = balloon[1];
            }
        }
        return minArrows;
    }

    public static void main(String[] args) {
        TreeMap<Integer, HashSet<Integer>> left = new TreeMap<>();
        HashSet<Integer> tmp = new HashSet<>();
        left.put(1, tmp);
        tmp.add(1);
        System.out.println(left);
    }
}
