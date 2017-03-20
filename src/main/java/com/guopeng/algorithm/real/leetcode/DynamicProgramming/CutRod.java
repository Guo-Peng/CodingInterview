package com.guopeng.algorithm.real.leetcode.DynamicProgramming;

import com.guopeng.algorithm.codeinterview.utils.Print;

/**
 * Created by guopeng on 17-3-20.
 */
public class CutRod {
    private static int[] maxPrice;
    private static int[] leftLength;

    /**
     * 钢筋的最优切割
     *
     * @param n
     * @param price
     * @return
     * @commnet 将钢筋的切割分为两段，第一段不切割 ，第二段使用子问题的最优解
     * rn = max(pi,rn-i) 1<=i<=n
     */
    public int cutRod(int n, int[] price) {
        if (maxPrice == null) {
            maxPrice = new int[n + 1];
            leftLength = new int[n + 1];
        }

        if (n <= 0) return 0;
        int p = 0;
        for (int i = 1; i < Math.min(price.length, n + 1); i++) {
            p = Math.max(p, price[i] + cutRod(n - i, price));
            if (p > maxPrice[n]) {
                maxPrice[n] = p;
                leftLength[n] = i;
            }
        }
        return p;
    }

    public String findCut(int n, String cut) {
        if (n == 0) return cut.substring(0, cut.length() - 1);
        return findCut(n - leftLength[n], cut + leftLength[n] + ",");
    }

    public static void main(String[] args) {
        int[] price = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        CutRod cut = new CutRod();
        cut.cutRod(10, price);
        Print.arrPrint(maxPrice);
        Print.arrPrint(leftLength);
        System.out.println(cut.findCut(5, ""));
    }
}
