package com.guopeng.algorithm.real.test;

import java.util.HashSet;

/**
 * Created by guopeng on 17-4-10.
 */
public class MinWindow {
    /**
     * 给定一个字符串，求包含所有字符的最短子串长度
     * 定义两个指针，如果没有完全包含则end后移直到全部包含
     * 包含之后移动start直到恰未完全包含
     *
     * @param str
     * @return
     */
    public static String minWindow(String str) {
        if (str == null) return null;

        int n = str.length();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++)
            set.add(str.charAt(i));

        int count = set.size();
        int[] table = new int[256];

        int eStart = 0, eEnd = n - 1, max = Integer.MAX_VALUE;
        for (int start = 0, end = 0; end < n; ) {
            while (count != 0 && end < n) {
                table[str.charAt(end)]++;
                if (table[str.charAt(end)] == 1)
                    count--;
                end++;
            }

            while (count == 0 && start <= end) {
                table[str.charAt(start)]--;
                if (table[str.charAt(start)] == 0)
                    count++;
                start++;
            }

//            System.out.println(String.format("start: %d,end: %d", start, end));
            if (end - start < max) {
                eStart = start;
                eEnd = end;
                max = eEnd - start;
            }
        }
        return str.substring(eStart - 1, eEnd);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("acbbaca"));
        System.out.println(minWindow("abccbaddac"));
        System.out.println(minWindow("aabcadbbbcca"));
    }
}
