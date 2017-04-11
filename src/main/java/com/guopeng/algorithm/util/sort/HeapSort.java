package com.guopeng.algorithm.util.sort;

import static com.guopeng.algorithm.util.Utils.exchange;

/**
 * Created by guopeng on 2017/3/5.
 */
public class HeapSort {
    public void heapSort(int[] arr) {
        if (arr == null) return;
        buildHeap(arr);
        sort(arr);
    }

    private void sort(int[] arr) {
        int n = arr.length;
        while (n > 1) {
            exchange(arr, 0, n - 1);
            sink(arr, 0, --n);
        }
    }

    private void buildHeap(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            sink(arr, i, arr.length);
        }
    }

    private void sink(int[] arr, int i, int N) {
        while (2 * (i + 1) <= N) {
            int j = 2 * (i + 1) - 1;
            if (j + 2 <= N && arr[j] < arr[j + 1]) j++;

            if (arr[i] < arr[j]) exchange(arr, i, j);
            i = j;
        }
    }

    private void swim(int[] arr, int i) {
        while (i > 0 && arr[i] > arr[(i + 1) / 2 - 1]) {
            exchange(arr, i, (i + 1) / 2 - 1);
            i = (i + 1) / 2 - 1;
        }
    }
}
