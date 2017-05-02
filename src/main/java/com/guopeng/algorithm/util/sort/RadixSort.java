package com.guopeng.algorithm.util.sort;

import com.guopeng.algorithm.codeinterview.utils.Print;

/**
 * Created by guopeng on 2017/4/3.
 */
public class RadixSort {
    public int[] radixSort(int[] arr, int radix) {
        int n = arr.length;
        int[][] tmp = new int[2][n];
        int flag = 0;
        System.arraycopy(arr, 0, tmp[flag], 0, n);

        int d = dim(arr, radix);
        int[] count = new int[radix];

        int r = 1;
        for (int i = 0; i < d; i++) {
            // 初始化count数组
            for (int j = 0; j < radix; j++)
                count[j] = 0;

            // 计数
            for (int num : tmp[flag])
                count[(num / r) % radix]++;

            // 统计不大于i的元素的个数
            for (int j = 1; j < radix; j++)
                count[j] += count[j - 1];

            // 排序
            for (int k = n - 1; k >= 0; k--) {
                tmp[1 - flag][count[tmp[flag][k] / r % radix] - 1] = tmp[flag][k];
                count[tmp[flag][k] / r % radix]--;
            }

            r *= radix;
            flag = 1 - flag;
        }
        return tmp[flag];
    }

    private int dim(int[] arr, int radix) {
        int max = Integer.MIN_VALUE;
        for (int num : arr)
            if (num > max) max = num;

        int d = 0;
        while (max > 0) {
            max /= radix;
            d++;
        }
        return d;
    }
}
