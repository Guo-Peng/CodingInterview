package com.guopeng.algorithm.real.test;

import com.guopeng.algorithm.codeinterview.utils.Print;

/**
 * Created by guopeng on 2017/4/3.
 */
public class SuffixArray {
    public static int[] getRank(String str) {
        int n = str.length();
        int[] rank = initRank(str);
        int[] secRank = new int[2 * n];
        int[] tmp;
        int[] sa = new int[n];
        int[] count = new int[n];  // 元素种数不会大于n

        for (int i = 0; i < n; i++)
            count[rank[i]]++;
        for (int i = 1; i < n; i++)
            count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--)
            sa[--count[rank[i]]] = i;

        int i, l, p;
        for (l = 1; l < n; l *= 2) {
            for (i = n - l, p = 0; i < n; i++)
                secRank[p++] = i;

            for (i = 0; i < n; i++)
                if (sa[i] >= l) // sa[i]为排名的索引，跳过索引小于l的位置，将后面的位置依次前移l个位置，并将最后l为置为最小
                    secRank[p++] = sa[i] - l;  // secRank 为第二个key的排序

            for (i = 0; i < n; i++)
                count[i] = 0;
            for (i = 0; i < n; i++)
                count[rank[secRank[i]]]++;
            for (i = 1; i < n; i++)
                count[i] += count[i - 1];
            for (i = n - 1; i >= 0; i--)
                sa[--count[rank[secRank[i]]]] = secRank[i];

            // ?数组长度，求rank
            for (tmp = rank, rank = secRank, secRank = tmp, p = 1, rank[sa[0]] = 0, i = 1; i < n; i++)
                rank[sa[i]] = cmp(secRank, sa[i - 1], sa[i], l) ? p - 1 : p++;
        }

        return sa;
    }

    public static boolean cmp(int[] r, int a, int b, int l) {
        return r[a] == r[b] && r[a + l] == r[b + l];
    }

    private static int[] initRank(String str) {
        int n = str.length();
        int[] ascii = new int[256];
        int[] rank = new int[2 * n];
        for (int i = 0; i < n; i++)
            ascii[str.charAt(i)] = 1;
        for (int i = 1; i < 256; i++)
            ascii[i] += ascii[i - 1];
        for (int i = 0; i < n; i++)
            rank[i] = ascii[str.charAt(i)] - 1;
        return rank;
    }


    public static void main(String[] args) {
        String str = "aabaaaab";
//        System.out.println((char) 94);
        Print.arrPrint(getRank(str));
    }
}
