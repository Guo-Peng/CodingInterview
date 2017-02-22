package com.guopeng.algorithm.codeinterview.chapter2;

/**
 * Created by guopeng on 2017/2/3.
 */
public class NumberOf1InBnary {
    /**
     * 输入一个整数,返回该数二进制表示中1的个数
     *
     * @param n
     * @return
     */
    public int numberOf1InBinary(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
