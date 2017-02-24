package com.guopeng.algorithm.codeinterview.chapter6;

/**
 * Created by guopeng on 2017/2/24.
 */
public class LastNumberInCircle {
    public int lastNumberInCircle(int n, int m) {
        if (n == 0) return 0;

        return (lastNumberInCircle(n - 1, m) + m) % n;
    }
}
