package com.guopeng.algorithm.codeinterview.chapter8;

/**
 * Created by guopeng on 2017/2/25.
 */
public class DuplicationInArray {
    public int duplicationInArray(int[] arr) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; ) {
            if (arr[i] != i) {
                if (arr[i] == arr[arr[i]]) return arr[i];
                else exchange(arr, i, arr[i]);
            } else i++;
        }
        return -1;
    }

    private void exchange(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
