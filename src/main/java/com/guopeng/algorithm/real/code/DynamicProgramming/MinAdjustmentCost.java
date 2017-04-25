package com.guopeng.algorithm.real.code.DynamicProgramming;

import com.guopeng.algorithm.codeinterview.utils.Print;
import com.guopeng.algorithm.util.collection.MonotoneQueue;

/**
 * Created by guopeng on 17-4-25.
 */
public class MinAdjustmentCost {
    public static int minAdjustmentCost(int[] arr, int target) {
        int k = 1 + 2 * target, n = arr.length;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int l = max - min + 1;
        int[][] dp = new int[n][l];
        for (int i = 0; i <= max - min; i++)
            dp[0][i] = arr[0] > min + i ? arr[0] - (min + i) : min + i - arr[0];

        for (int i = 1; i < n; i++) {
            MonotoneQueue queue = new MonotoneQueue(k);
            queue.setOrder(true);

            int index = -target;
            while (index < target) {
                if (index < 0) queue.add(Integer.MAX_VALUE);
                else queue.add(dp[i - 1][index]);
                index++;
            }

            for (int j = 0; j < l; j++) {
                int num = index + j < l ? dp[i - 1][index + j] : Integer.MAX_VALUE;
                dp[i][j] = (arr[i] > min + j ? arr[i] - (min + j) : min + j - arr[i]) + queue.add(num);
            }
        }

        int result = Integer.MAX_VALUE;
        for (int num : dp[n - 1])
            result = Math.min(result, num);

        return result;
    }

    public static int minAdjustmentCostII(int[] arr, int target) {
        int n = arr.length;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int l = max - min + 1;
        int[][] dp = new int[n][l];
        for (int i = 0; i <= max - min; i++)
            dp[0][i] = arr[0] > min + i ? arr[0] - (min + i) : min + i - arr[0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < l; j++) {
                int cost = arr[i] > min + j ? arr[i] - (min + j) : min + j - arr[i];
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 0; k < l; k++) {
                    int abs = j > k ? j - k : k - j;
                    if (abs <= target)
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][k]);
                }
                dp[i][j] += cost;
            }
            Print.arrPrint(dp[i]);
        }

        int result = Integer.MAX_VALUE;
        for (int num : dp[n - 1])
            result = Math.min(result, num);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3};
        System.out.println(minAdjustmentCostII(arr, 1));
    }
}
