package com.guopeng.algorithm.util;

/**
 * Created by guopeng on 2017/4/3.
 */
public class CountingSort {
    /**
     * 计数排序
     * 将每个位置的数字进行计数，然后统计不大于每个数字的数的个数k
     * k表示该数字的最远位置，-1即为该数字最远的索引，来一个i后将该索引--
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] countingSort(int[] arr, int k) {
        int[] result = new int[arr.length];
        int[] count = new int[k];

        for (int num : arr)
            count[num]++;
        for (int i = 1; i < k; i++)
            count[i] += count[i - 1];
        for (int num : arr) {
            result[count[num] - 1] = num;
            count[num]--;
        }

        return result;
    }
}
