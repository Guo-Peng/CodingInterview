package com.guopeng.algorithm.real.code.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guopeng on 17-4-28.
 */
public class NumberOfBoomerangs {
    public static int numberOfBoomerangs(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int d = dis(points[i], points[j]);

                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            for (int count : map.values())
                result += count * (count - 1);
        }
        return result;
    }

    private static int dis(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }

    public static void main(String[] args) {
        int[][] points = {{0, 0}, {1, 0}, {2, 0}};
        System.out.println(numberOfBoomerangs(points));
    }
}
