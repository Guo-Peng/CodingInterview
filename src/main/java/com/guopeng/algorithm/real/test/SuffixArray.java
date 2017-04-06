package com.guopeng.algorithm.real.test;

import com.guopeng.algorithm.codeinterview.utils.Print;

/**
 * Created by guopeng on 2017/4/3.
 */
public class SuffixArray {
    public static int[] suffixArray(String str) {
        int n = str.length();
        int[] rank = initRank(str);
        int[] secSa = new int[2 * n];
        int[] tmp;
        int[] sa = new int[n];
        int[] count = new int[n];

        int i, l, p, max = 0;

        for (i = n; i < 2 * n; i++) {
            rank[i] = -1;
            secSa[i] = -1;
        }

        for (i = 0; i < n; i++) {
            count[rank[i]]++;
            if (rank[i] > max) max = rank[i] + 1;
        }

        for (i = 1; i < max; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--)
            sa[--count[rank[i]]] = i;

        for (l = 1, p = 1; p < n; l *= 2, max = p) {
            for (i = n - l, p = 0; i < n; i++)
                secSa[p++] = i;

            for (i = 0; i < n; i++)
                if (sa[i] >= l)
                    secSa[p++] = sa[i] - l;

            for (i = 0; i < max; i++)
                count[i] = 0;
            for (i = 0; i < n; i++)
                count[rank[secSa[i]]]++;
            for (i = 1; i < max; i++)
                count[i] += count[i - 1];
            for (i = n - 1; i >= 0; i--)
                sa[--count[rank[secSa[i]]]] = secSa[i];

            for (tmp = rank, rank = secSa, secSa = tmp, p = 1, rank[sa[0]] = 0, i = 1; i < n; i++)
                rank[sa[i]] = cmp(secSa, sa[i - 1], sa[i], l) ? p - 1 : p++;
        }

        return sa;
    }

    private static boolean cmp(int[] r, int a, int b, int l) {
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

    private static int[] getRank(int[] sa) {
        int[] rank = new int[sa.length];
        for (int i = 0; i < sa.length; i++) {
            rank[sa[i]] = i;
        }
        return rank;
    }


    public static void main(String[] args) {
        String str = "abcdefg";
        int[] sa = suffixArray(str);
        int[] rank = getRank(sa);
        System.out.println("sa 数组：");
        Print.arrPrint(sa);
        System.out.println("rank 数组：");
        Print.arrPrint(rank);
    }
}
