package com.guopeng.algorithm.real.code.Math;

/**
 * Created by guopeng on 17-4-25.
 */
public class Sqrt {
    public static int mySqrt(int x) {
        if (x <= 0) return 0;

        int lo = 0, hi = x;
        while (lo < hi) {
            int mid = hi - (hi - lo) / 2;
            if ((long) mid * mid > x) hi = mid - 1;
            else lo = mid;
        }
        return hi;
    }

    public static int mySqrtII(int x) {
        long r = x;
        while (r * r > x)
            r = (r + x / r) / 2;
        return (int) r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(10));
        System.out.println(mySqrtII(10));
        System.out.println(mySqrt(2147395599));
        System.out.println(mySqrtII(2147395599));
        System.out.println(mySqrt(2147483647));
        System.out.println(mySqrtII(2147483647));
    }
}
