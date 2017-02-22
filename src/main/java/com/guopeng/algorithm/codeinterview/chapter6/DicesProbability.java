package com.guopeng.algorithm.codeinterview.chapter6;

/**
 * Created by guopeng on 2017/2/21.
 */
public class DicesProbability {
    private int maxValue = 6;
    private int flag = 0;

    /**
     * n个骰子点数和的概率
     *
     * @param n
     * @comment 递推公式为f'(n) = f(n-1) + f(n-2) + ... + f(n-6)，递归依次设置第i个骰子的点数，点数的位置不确定导致有很多重复计算
     * f'(n)为当前轮的点数和 f(n)为上一轮的点数和
     * 使用一个二维数组存储当前轮与上一轮的点数和
     * 修改当前轮时使用的数组为上上轮的数组，第三轮使用的是第一轮的数组，此时f(1) f(2)为1，这会影响下一轮的更新
     * 修改当前轮时将1 ~ n-1的值归为0然后更新 n~6*n的值
     */
    public void dicesProbability(int n) {
        int[][] sumCount = new int[2][maxValue * n + 1];

        for (int i = 1; i <= maxValue; i++) sumCount[flag][i] = 1;

        for (int i = 2; i <= n; i++) {
            increaseNumber(sumCount, i);
            flag = 1 - flag;
        }

        double total = Math.pow(maxValue, n);
        for (int i = n; i <= maxValue * n; i++) {
            System.out.println(String.format("sum : %d , prob : %f , count : %d", i, sumCount[flag][i] / total, sumCount[flag][i]));
        }
    }

    private void increaseNumber(int[][] sumCount, int n) {
        for (int i = 1; i < n; i++) sumCount[1 - flag][i] = 0;

        for (int i = n; i <= n * maxValue; i++)
            sumCount[1 - flag][i] = sum(sumCount[flag], i - maxValue, i - 1);
    }

    private int sum(int[] arr, int lo, int hi) {
        if (lo <= 1) lo = 1;

        int curSum = 0;
        for (int i = lo; i <= hi; i++) {
            curSum += arr[i];
        }
        return curSum;
    }
}
