package com.guopeng.algorithm.util.sort;

import static com.guopeng.algorithm.util.Utils.exchange;

/**
 * Created by guopeng on 2017/3/4.
 */
public class InsertSort {
    public void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                exchange(arr, j, j - 1);
            }
        }
    }
}
