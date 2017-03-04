package com.guopeng.algorithm.util;

import static com.guopeng.algorithm.util.Utils.exchange;

/**
 * Created by guopeng on 2017/3/4.
 */
public class BubbleSort {
    public void bubbleSort(int[] arr) {
        if (arr == null) return;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    exchange(arr, j, j - 1);
                }
            }
        }
    }

}
