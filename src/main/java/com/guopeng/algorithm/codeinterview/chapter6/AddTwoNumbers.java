package com.guopeng.algorithm.codeinterview.chapter6;

/**
 * Created by guopeng on 2017/2/24.
 */
public class AddTwoNumbers {
    /**
     * 不用四则运算做加法
     *
     * @param a
     * @param b
     * @return 1 计算每位上的加法
     * 2 计算每位上的进位
     * 3 将进位与各位相加
     * <p>
     * 1 异或为每位上的二进制加法
     * 2 与为进位的结果需要左移1位
     * 3 将两个结果递归
     */
    public int addTwoNumbers(int a, int b) {
        return b == 0 ? a : addTwoNumbers(a ^ b, (a & b) << 1);
    }
}
