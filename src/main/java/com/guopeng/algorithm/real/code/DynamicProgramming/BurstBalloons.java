package com.guopeng.algorithm.real.code.DynamicProgramming;

/**
 * Created by guopeng on 2017/4/8.
 * Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums.
 * You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins.
 * Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.
 * <p>
 * Find the maximum coins you can collect by bursting the balloons wisely.
 * <p>
 * (1) You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
 * (2) 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
 * Given [3, 1, 5, 8]
 * <p>
 * Return 167
 * <p>
 * nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
 * coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
 */
public class BurstBalloons {
    /**
     * http://blog.csdn.net/swartz2015/article/details/50561199
     *
     * @param balloons
     * @return
     */
    public int maxCoins(int[] balloons) {
        if (balloons == null) return 0;

        int n = balloons.length + 2;
        int[] coins = new int[n];
        for (int i = 1; i < n - 1; i++) coins[i] = balloons[i - 1];
        coins[0] = coins[n - 1] = 1;

        int[][] dp = new int[n][n];
        for (int l = 3; l <= n; l++) {
            for (int left = 0; left < n - l + 1; left++) {
                int right = left + l - 1;
                int max = 0;
                for (int s = left + 1; s < right; s++) {
                    int count = dp[left][s] + coins[left] * coins[s] * coins[right] + dp[s][right];
                    if (count > max) max = count;
                }
                dp[left][right] = max;
            }
        }
        return dp[0][n - 1];
    }
}
