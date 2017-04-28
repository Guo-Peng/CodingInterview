package com.guopeng.algorithm.real.code.DynamicProgramming;

/**
 * Created by guopeng on 2017/4/13.
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction
 * (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Input: [7, 1, 5, 3, 6, 4]
 * Output: 5
 * <p>
 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 * <p>
 * Input: [7, 6, 4, 3, 1]
 * Output: 0
 * <p>
 * In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int min = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else
                result = Math.max(result, prices[i] - min);
        }

        return result;
    }

    public int maxProfitII(int[] prices) {
        int max = 0, result = 0;
        for (int i = 1; i < prices.length - 1; i++) {
            max += prices[i] - prices[i - 1];
            max = Math.max(0, max);
            result = Math.max(result, max);
        }

        return result;
    }
}
