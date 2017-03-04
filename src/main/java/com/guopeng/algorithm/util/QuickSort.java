package com.guopeng.algorithm.util;


import static com.guopeng.algorithm.util.Utils.exchange;

/**
 * Created by guopeng on 2017/3/4.
 */
public class QuickSort {
    public void quickSort(int[] arr, int lo, int hi) {
        if (arr == null || lo >= hi) return;

        int index = partition(arr, lo, hi);
        if (index > lo) quickSort(arr, lo, index - 1);
        if (index < hi) quickSort(arr, index + 1, hi);
    }

    private int partition(int[] arr, int lo, int hi) {
        int cur = lo;
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= arr[lo]) {
                cur++;
                if (i != cur) {
                    exchange(arr, cur, i);
                }
            }
        }

        exchange(arr, lo, cur);
        return cur;
    }
}
