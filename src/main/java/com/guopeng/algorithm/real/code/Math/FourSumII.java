package com.guopeng.algorithm.real.code.Math;

import java.util.HashMap;

/**
 * Created by guopeng on 2017/4/23.
 */
public class FourSumII {
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = A[i] + B[j];
                int count = map.getOrDefault(sum, 0);
                map.put(sum, count + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                result += map.getOrDefault(-(C[i] + D[j]), 0);

        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {-1, -1};
        int[] B = {-1, 1};
        int[] C = {-1, 1};
        int[] D = {1, -1};
        System.out.println(fourSumCount(A, B, C, D));
    }
}
