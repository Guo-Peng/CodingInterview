package com.guopeng.algorithm.util.sort;

import static com.guopeng.algorithm.util.Utils.exchange;

/**
 * Created by guopeng on 2017/3/4.
 */
public class SelectionSort {
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            exchange(arr, i, index);
        }
    }
}
