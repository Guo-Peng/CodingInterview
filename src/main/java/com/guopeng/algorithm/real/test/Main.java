package com.guopeng.algorithm.real.test;

import com.guopeng.algorithm.codeinterview.utils.Print;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by guopeng on 2017/3/25.
 */

class Main {

    static int[] wa = new int[100];
    static int[] wb = new int[100];
    static int[] wv = new int[100];
    static int[] ws = new int[100];

    public static boolean cmp(int[] r, int a, int b, int l) {
        return r[a] == r[b] && r[a + l] == r[b + l];
    }

    public static int[] da(int[] r, int[] sa, int n, int m) {
        int i, j, p;
        int[] x = wa;
        int[] y = wb;
        int[] t;
        for (i = 0; i < m; i++)
            ws[i] = 0;
        for (i = 0; i < n; i++)
            ws[x[i] = r[i]]++;
        for (i = 1; i < m; i++)
            ws[i] += ws[i - 1];
        for (i = n - 1; i >= 0; i--)
            sa[--ws[x[i]]] = i;

        for (j = 1, p = 1; p < n; j *= 2, m = p) {
            for (p = 0, i = n - j; i < n; i++)
                y[p++] = i;

            for (i = 0; i < n; i++)
                if (sa[i] >= j)
                    y[p++] = sa[i] - j;


            for (i = 0; i < n; i++)
                wv[i] = x[y[i]];

            for (i = 0; i < m; i++)
                ws[i] = 0;
            for (i = 0; i < n; i++)
                ws[wv[i]]++;
            for (i = 1; i < m; i++)
                ws[i] += ws[i - 1];
            for (i = n - 1; i >= 0; i--)
                sa[--ws[wv[i]]] = y[i];
            Print.arrPrint(sa);

            for (t = x, x = y, y = t, p = 1, x[sa[0]] = 0, i = 1; i < n; i++)
                x[sa[i]] = cmp(y, sa[i - 1], sa[i], j) ? p - 1 : p++;

//            Print.arrPrint(x);
        }
        return sa;
    }

    public static int[] calheight(int[] r, int[] sa, int[] rank, int n) {
        int height[] = new int[n + 1];
        int i = 0, j = 0, k = 0;
        for (i = 0; i < n; i++) {
            // 初始化
            if (k != 0)
                k--;
            if (rank[i] - 1 >= 0) {
                j = sa[rank[i] - 1];
            } else {
                j = 0;
            }
            while (true) {
                if (j + k >= n || i + k >= n)
                    break;
                if (r[i + k] != r[j + k])
                    break;
                k++;
            }
            height[rank[i]] = k;
        }
        return height;
    }

    public static void main(String[] args) {
        String string = "aabaaaab";
        int[] r = new int[string.length()];
        int[] sa = new int[string.length()];
        int[] rank = new int[string.length()];
        int[] height = new int[string.length()];
        int up = 0;
        for (int i = 0; i < string.length(); i++) {
            r[i] = string.charAt(i) - 'a';// 纯字母字符串
            if (up < r[i])
                up = r[i];
        }
        up++;
        // r[string.length()]=up;//末尾与所有字符不同，用于height数组的计算
        sa = da(r, sa, string.length(), up);
        for (int i = 0; i < sa.length; i++) {
            rank[sa[i]] = i;//通过rank和sa的关系求出rank的值
        }
        // 到这里rank和sa都已经得到了
        // 下面需要做的就是求height的值了
        System.out.println("sa数组：");
        for (int i = 0; i < sa.length; i++) {

            System.out.print(sa[i] + ",");
        }// 下面需要做的就是求height的值了
        System.out.println("\nrank数组：");
        for (int i = 0; i < sa.length; i++) {

            System.out.print(rank[i] + ",");
        }
        height = calheight(r, sa, rank, string.length());
        System.out.println("\nheight数组：");
        for (int i = 1; i < sa.length; i++) {
            //我觉得按照定义，height[0]应该就是为0吧……
            System.out.print(height[i] + ",");
        }
        /*注：由于我的程序是从0位开始的，故比《算法合集之《后缀数组——处理字符串的有力工具》.pdf》中的结果都
         * 小1 */
    }
}
