package com.guopeng.algorithm.codeinterview.chapter5;

/**
 * Created by guopeng on 2017/2/16.
 */
public class GetUglyNumber {
    /**
     * 只包含因子2 3 5的数为丑数，1为第一个丑数
     * 找到第n个丑数
     *
     * @param n
     * @return
     * @throws Exception
     * @comment 将之前的丑数乘 2 3 5，找到最小的数即为下一个丑数
     * 定义3个索引分别指向 乘 2 3 5 后恰大于当前最大丑数的数字
     * 每次得到下一个丑数后更新索引
     */
    public int getUglyNumber(int n) throws Exception {
        if (n <= 0) throw new Exception("Invalid Input");
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;
        int nextNum = 1;
        while (nextNum < n) {
            int min = minOf3Number(uglyNumbers, multiply2, multiply3, multiply5);

            uglyNumbers[nextNum] = min;

            while (uglyNumbers[multiply2] <= uglyNumbers[nextNum]) multiply2++;
            while (uglyNumbers[multiply3] <= uglyNumbers[nextNum]) multiply3++;
            while (uglyNumbers[multiply5] <= uglyNumbers[nextNum]) multiply5++;
            nextNum++;
        }
        return uglyNumbers[n - 1];
    }

    private int minOf3Number(int[] uglyNumbers, int a, int b, int c) {
        return Math.min(Math.max(uglyNumbers[a], uglyNumbers[b]), uglyNumbers[c]);
    }
}
