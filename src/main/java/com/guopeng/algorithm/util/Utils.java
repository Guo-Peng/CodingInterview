package com.guopeng.algorithm.util;

/**
 * Created by guopeng on 2017/3/4.
 */
public class Utils {
    public static void exchange(int[] arr, int index1, int index2) {
        if (index1 == index2) return;

        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
