package com.guopeng.algorithm.real.code.DynamicProgramming;

import com.guopeng.algorithm.codeinterview.utils.Print;

/**
 * Created by guopeng on 17-4-26.
 */
public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String str1, String str2) {
        if (str1 == null || str2 == null) return 0;
        int l1 = str1.length() + 1, l2 = str2.length() + 1;
        if (l1 == 0 || l2 == 0) return 0;

        int[][] dp = new int[l1][l2];

        for (int i = 1; i < l1; i++) {
            for (int j = 1; j < l2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[l1 - 1][l2 - 1];
    }

    public static int longestCommonString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                dp[i][j] = str1.charAt(i - 1) == str2.charAt(j - 1) ? dp[i - 1][j - 1] + 1 : 0;
                result = Math.max(result, dp[i][j]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "belong";
        String str2 = "cnblogs";
        System.out.println(longestCommonSubsequence(str1, str2));
        System.out.println(longestCommonString(str1, str2));

        str1 = "BDCABA";
        str2 = "ABCBDAB";
        System.out.println(longestCommonSubsequence(str1, str2));
        System.out.println(longestCommonString(str1, str2));
    }
}
