package com.guopeng.algorithm.real.meituan;


/**
 * Created by guopeng on 2017/3/29.
 */
public class LeastJump {
    public int leastJump(int[] arr) {
        if (arr == null) return -1;
        int n = arr.length;

        int[] f = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] + i <= n - 1) {
                f[i] = Math.min(1 + f[i + arr[i]], 1 + f[i + 1]);
            } else {
                f[i] = 1 + f[i + 1];
            }
        }
        return f[0];
    }
}
