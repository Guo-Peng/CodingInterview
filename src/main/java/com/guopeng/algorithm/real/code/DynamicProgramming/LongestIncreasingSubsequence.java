package com.guopeng.algorithm.real.code.DynamicProgramming;

import com.guopeng.algorithm.codeinterview.utils.Print;
import com.guopeng.algorithm.real.code.Math.BinarySearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by guopeng on 2017/4/23.
 */
public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        if (nums == null) return 0;
        int n = nums.length;
        if (n <= 1) return n;

        int result = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public static int lengthOfLISII(int[] nums) {
        if (nums == null) return 0;
        int n = nums.length;
        if (n <= 1) return n;

        int[] dp = new int[n];
        int len = 0;

        for (int i = 0; i < n; i++) {
            int index = BinarySearch.binarySearchFirstPos(dp, len, nums[i]);
            if (index >= 0) continue;
            else index = -(index + 1);

            dp[index] = nums[i];
            if (index==len)
                len++;
        }

        return len;
    }


    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(arr));
        System.out.println(lengthOfLISII(arr));

        arr = new int[]{2, 2};
        System.out.println(lengthOfLIS(arr));
        System.out.println(lengthOfLISII(arr));
    }
}
