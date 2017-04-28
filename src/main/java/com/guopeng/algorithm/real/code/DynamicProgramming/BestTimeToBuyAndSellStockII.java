package com.guopeng.algorithm.real.code.DynamicProgramming;

/**
 * Created by guopeng on 2017/4/26.
 */
public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        if (prices == null) return 0;
        int n = prices.length;
        int min = 0, result = 0;
        if (n == 1) return result;

        for (int i = 0; i < n; ) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            min = prices[i++];

            while (i < n - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            result += i < prices.length ? prices[i++] - min : 0;
        }
        return result;
    }

    public int maxProfitII(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) total += prices[i + 1] - prices[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(maxProfit(arr));
        arr = new int[]{1, 2};
        System.out.println(maxProfit(arr));
    }
}
