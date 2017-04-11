package com.guopeng.algorithm.real.ms;

/**
 * Created by guopeng on 2017/4/10.
 */
public class Catalan {
    public long catalan(int n) {
        long[] cache = new long[n + 1];

        cache[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                cache[i] += cache[j] * cache[i - j - 1];
            }
        }
        return cache[n];
    }
}
