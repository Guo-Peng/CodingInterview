package com.guopeng.algorithm.util;

/**
 * Created by guopeng on 2017/3/4.
 */
public class MergeSort {
    private int[] aux;

    public void mergeSort(int[] arr, int lo, int hi) {
        if (arr == null || lo >= hi) return;
        aux = new int[arr.length];

        mergeSort(arr, lo, (lo + hi) / 2);
        mergeSort(arr, (lo + hi) / 2 + 1, hi);

        merge(arr, lo, (lo + hi) / 2, hi);
    }

    private void merge(int[] arr, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = arr[i];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) arr[k] = aux[j++];
            else if (j > hi) arr[k] = aux[i++];
            else if (aux[i] > aux[j]) arr[k] = aux[j++];
            else arr[k] = aux[i++];
        }
    }
}
