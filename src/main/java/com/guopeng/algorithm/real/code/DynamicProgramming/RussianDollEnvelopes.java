package com.guopeng.algorithm.real.code.DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by guopeng on 17-4-25.
 */
public class RussianDollEnvelopes {
    static class com implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            if (o1[0] != o2[0]) return o1[0] - o2[0];
            else return o2[1] - o1[1];
        }
    }

    public static int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new com());

        int n = envelopes.length;
        int[] dp = new int[n];
        int len = 0;

        for (int i = 0; i < n; i++) {
            int index = Arrays.binarySearch(dp, 0, len, envelopes[i][1]);
            if (index < 0) index = -(index + 1);
            dp[index] = envelopes[i][1];
            if (index == len) len++;
        }

        return len;
    }

    public static void main(String[] args) {
        int[][] arr = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        System.out.println(maxEnvelopes(arr));

        arr = new int[][]{{4, 5}, {4, 6}, {6, 7}, {2, 3}, {1, 1}};
        System.out.println(maxEnvelopes(arr));
    }
}
