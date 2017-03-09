package com.guopeng.algorithm.util;

/**
 * Created by guopeng on 2017/3/9.
 */
public class BM {
    public int search(String pattern, String str) {
        int[] right = skipArr(pattern);

        int step = 0;
        for (int i = 0; i <= str.length() - pattern.length(); i += step) {
            step = 0;
            for (int j = pattern.length() - 1; j >= 0; j--)
                if (str.charAt(i + j) != pattern.charAt(j)) {
                    step = j - right[str.charAt(i + j)];
                    if (step < 1) step = 1;
                    break;
                }
            if (step == 0) return i;
        }
        return -1;
    }

    private int[] skipArr(String pattern) {
        int[] right = new int[256];
        for (int i = 0; i < 256; i++)
            right[i] = -1;
        for (int i = 0; i < pattern.length(); i++)
            right[pattern.charAt(i)] = i;
        return right;
    }

    public static void main(String[] args) {
        System.out.println(new BM().search("AACAA", "AABRAACADABRAACAADABRA"));
    }
}
