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

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
