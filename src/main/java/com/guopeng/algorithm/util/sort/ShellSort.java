package com.guopeng.algorithm.util.sort;

import static com.guopeng.algorithm.util.Utils.exchange;

/**
 * Created by guopeng on 2017/3/4.
 */
public class ShellSort {
    public void shellSort(int[] arr) {
        int h = 1;
        while (h < arr.length / 3) h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h) {
                    exchange(arr, j, j - h);
                }
            }
            h /= 3;
        }
    }
}
