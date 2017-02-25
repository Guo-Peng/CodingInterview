package com.guopeng.algorithm.codeinterview.chapter8;

/**
 * Created by guopeng on 2017/2/25.
 */
public class DuplicationInArray {
    /**
     * 找到数组中重复的元素
     * 数组长度为n，元素范围为0-n
     *
     * @param arr
     * @return
     * @comment 依次检测数组元素与下标是否一致，不一致则交换至其该在的位置，如果重复则该位置的元素与i位置的元素相等
     */
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
