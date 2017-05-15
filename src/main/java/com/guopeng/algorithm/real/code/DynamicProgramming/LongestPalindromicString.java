package com.guopeng.algorithm.real.code.DynamicProgramming;

/**
 * Created by guopeng on 2017/5/7.
 */
public class LongestPalindromicString {
    public static String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String tmp = len(s, i, i);
            result = tmp.length() > result.length() ? tmp : result;
            tmp = len(s, i, i + 1);
            result = tmp.length() > result.length() ? tmp : result;
        }
        return result;
    }

    private static String len(String str, int low, int hi) {
        while (low >= 0 && hi < str.length() && str.charAt(low) == str.charAt(hi)) {
            low--;
            hi++;
        }
        return str.substring(low + 1, hi);
    }

    public static String longestPalindromeDP(String s) {
        if (s == null || s.length() == 0) return "";

        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        String result = "" + s.charAt(n - 1);
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = true;
            if (i < n - 1) dp[i + 1][i] = true;

            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i + 1][j - 1];
                else dp[i][j] = false;

                if (dp[i][j] && j - i + 1 >= result.length())
                    result = s.substring(i, j + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindromeDP("babad"));
        System.out.println(longestPalindromeDP("cbbd"));
    }
}
