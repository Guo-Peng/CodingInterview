package com.guopeng.algorithm.real.code.Math;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guopeng on 2017/4/22.
 */
public class MaxPointsOnALine {
    static class Point {
        int x;
        int y;

        Point() {
        }

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int maxPoints1(Point[] points) {
        int n = points.length;
        if (n <= 2) return n;

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (equal(points[i], points[j]))
                    continue;
                result = Math.max(result, count(points[i], points[j], points));
            }
        }

        return result == 0 ? n : result;
    }

    private static int count(Point p1, Point p2, Point[] points) {
        int c = 0;
        for (Point point : points) {
            if (isLinear(p1, p2, point))
                c++;
        }
        return c;
    }

    private static boolean isLinear(Point p1, Point p2, Point p3) {
        return equal(p1, p3) || equal(p2, p3) ||
                (long) (p1.y - p3.y) * (p2.x - p3.x) == (long) (p2.y - p3.y) * (p1.x - p3.x);
    }

    private static boolean equal(Point p1, Point p2) {
        return p1.x == p2.x && p1.y == p2.y;
    }

    public static int maxPoints(Point[] points) {
        int n = points.length;
        if (n <= 2) return n;

        int result = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Integer, Map<Integer, Integer>> count = new HashMap<>();
            int max = 0, overlap = 1;
            for (int j = i + 1; j < n; j++) {
                if (equal(points[i], points[j])) {
                    overlap++;
                    continue;
                }

                int y = points[j].y - points[i].y;
                int x = points[j].x - points[i].x;
                int g = gcd(x, y);
                if (g != 0) {
                    x /= g;
                    y /= g;
                }

                Map<Integer, Integer> tmp = count.getOrDefault(x, new HashMap<>());
                int c = tmp.getOrDefault(y, 0);
                tmp.put(y, c + 1);
                if (!count.containsKey(x))
                    count.put(x, tmp);
                max = Math.max(max, c + 1);
            }

            result = Math.max(result, max + overlap);
        }
        return result;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(-1, -1);
        Point p3 = new Point(2, 2);

        Point[] points = {p1, p2, p3};
        System.out.println(maxPoints(points));

        p2 = new Point(0, 65536);
        p3 = new Point(65536, 0);

        points = new Point[]{p1, p2, p3};
        System.out.println(maxPoints(points));
    }
}
