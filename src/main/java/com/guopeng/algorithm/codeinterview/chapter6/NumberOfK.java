package com.guopeng.algorithm.codeinterview.chapter6;

/**
 * Created by guopeng on 2017/2/17.
 */
public class NumberOfK {
    /**
     * 数字在排序数组中的次数
     *
     * @param arr
     * @param k
     * @return
     * @throws Exception
     * @comment 分别找到第一次出现以及最后一次出现的索引
     */
    public int numberOfK(int[] arr, int k) throws Exception {
        if (arr == null) throw new Exception("Invalid Input");

        int first = getFirstK(arr, k, 0, arr.length - 1);
        int last = getLastK(arr, k, 0, arr.length - 1);
        if (first == -1 || last == -1) throw new Exception("no such element");

        return last - first + 1;
    }

    /**
     * 找到数字第一次出现的索引
     *
     * @param arr
     * @param k
     * @param lo
     * @param hi
     * @return
     * @comment 不等于k则继续二分缩小范围，没有找到则返回-1
     * 找到等于k的数字时，观察前一个元素是否不为k，满足则返回，不满足则继续向左缩小范围，如果下标为0则左侧无元素不用缩小范围
     */
    private int getFirstK(int[] arr, int k, int lo, int hi) {
        if (hi < lo) return -1;

        int mid = (lo + hi) / 2;
        if (arr[mid] == k) {
            if (mid == 0 || arr[mid - 1] != k) return mid;
            else hi = mid - 1;
        } else if (arr[mid] > k) hi = mid - 1;
        else lo = mid + 1;

        return getFirstK(arr, k, lo, hi);
    }

    private int getLastK(int[] arr, int k, int lo, int hi) {
        if (hi < lo) return -1;

        int mid = (lo + hi) / 2;
        if (arr[mid] == k) {
            if (mid == arr.length - 1 || arr[mid + 1] != k) return mid;
            else lo = mid + 1;
        } else if (arr[mid] > k) hi = mid - 1;
        else lo = mid + 1;

        return getLastK(arr, k, lo, hi);
    }
}
