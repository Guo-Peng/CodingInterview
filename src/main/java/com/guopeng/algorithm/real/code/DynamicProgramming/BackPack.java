package com.guopeng.algorithm.real.code.DynamicProgramming;

/**
 * Created by guopeng on 17-4-24.
 */
public class BackPack {
    /**
     * 在n个物品中挑选若干物品装入背包，最多能装多满？假设背包的大小为m，每个物品的大小为A[i]
     * 价值与大小一致
     *
     * @param m
     * @param A
     * @return
     */
    public static int backPack(int m, int[] A) {
        int[] f = new int[m + 1];
        int n = A.length;

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 0; j--) {
                if (j - A[i] >= 0)
                    f[j] = Math.max(f[j], f[j - A[i]] + A[i]);
            }

        }
        return f[m];
    }

    /**
     * 给出n个物品的体积A[i]和其价值V[i]，将他们装入一个大小为m的背包，最多能装入的总价值有多大？
     *
     * @param m
     * @param A
     * @param V
     * @return
     */
    public static int backPackII(int m, int[] A, int V[]) {
        int[] f = new int[m + 1];
        int n = A.length;

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 0; j--) {
                if (j >= A[i])
                    f[j] = Math.max(f[j], f[j - A[i]] + V[i]);
            }
        }
        return f[m];
    }

    /**
     * 每个物品的个数单独考虑 o(VNk)
     *
     * @param m
     * @param A
     * @param V
     * @return
     */
    public static int completePack(int m, int[] A, int V[]) {
        int[] f = new int[m + 1];
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 0; j--) {
                for (int k = 0; k <= j / A[i]; k++)
                    f[j] = Math.max(f[j], f[j - k * A[i]] + k * V[i]);
            }
        }

        return f[m];
    }

    public static int completePackII(int m, int[] A, int V[]) {
        int[] f = new int[m + 1];
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j >= A[i])
                    f[j] = Math.max(f[j], f[j - A[i]] + V[i]);
            }
        }

        return f[m];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 5};
        System.out.println(backPack(10, arr));

        int[] A = new int[]{2, 3, 5, 7};
        int[] V = new int[]{1, 5, 2, 4};
        System.out.println(backPackII(10, A, V));

        A = new int[]{3, 2, 2};
        V = new int[]{5, 10, 20};
        System.out.println(completePack(5, A, V));
        System.out.println(completePackII(5, A, V));
    }
}
