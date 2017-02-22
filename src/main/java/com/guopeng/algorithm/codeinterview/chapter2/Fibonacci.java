package com.guopeng.algorithm.codeinterview.chapter2;

/**
 * Created by guopeng on 2017/2/3.
 */
public class Fibonacci {
    public long fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
//        else return fibonacci(n - 1) + fibonacci(n - 2);
        long fn = 0;
        long fnMinus2 = 0;
        long fnMinus1 = 1;
        for (int i = 2; i <= n; i++) {
            fn = fnMinus1 + fnMinus2;

            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }

        return fn;
    }
}
