package com.guopeng.algorithm.codeinterview.chapter2;

/**
 * Created by guopeng on 2017/2/2.
 */
public class MinNumberInRotatedArray {
    /**
     * 将有序数组的前几个搬移至最后则为旋转数组
     * 寻找旋转数组中的最小值
     *
     * @param arr
     * @return
     * @throws Exception
     * @comment 数组有序即可进行二分查找
     * 中间元素大于第一个元素则其属于左侧
     * 中间元素小于最后一个元素则其属于右侧
     *
     * @special 搬移0个元素即数组有序时可以直接返回
     * 有序数组包含重复的最大值则可能出现 lo == mid == hi,此时无法判别中间元素位于哪侧,顺序查找
     *
     */
    public int minNumberInRotatedArray(int[] arr) throws Exception {
        if (arr == null) throw new Exception("Invalid Input");
        if (arr.length == 1) return arr[0];

        return findMin(arr, 0, arr.length - 1);
    }

    private int findMin(int[] arr, int lo, int hi) throws Exception {
        if (arr[hi] > arr[lo]) return arr[lo];
        if (hi - lo == 1) return arr[hi];

        int index = (lo + hi) / 2;
        if (arr[index] == arr[lo] && arr[index] == arr[hi]) return findMinInOrder(arr);

        if (arr[index] >= arr[lo]) return findMin(arr, index, hi);
        else if (arr[index] <= arr[hi]) return findMin(arr, lo, index);
        else throw new Exception("Invalid Input");
    }

    private int findMinInOrder(int[] arr) {
        int min = arr[0];
        for (int a : arr) if (a < min) min = a;
        return min;
    }
}
