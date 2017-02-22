package com.guopeng.algorithm.codeinterview.chapter5;

/**
 * Created by guopeng on 2017/2/17.
 */
public class InversePairs {
    /**
     * 求数组中的逆序对的数目
     * 前面的数字大于后面的数字即为一个逆序对
     *
     * @param arr
     * @return
     * @throws Exception
     * @comment 将数组拆分为一个个小数组，小数组的数组不影响数组间的逆序对数目
     * 先求出数组内部的逆序对，然后将数组合并求出大数组的逆序对数目
     * 区间不断合并 思想为归并排序
     */
    public int inversePairs(int[] arr) throws Exception {
        if (arr == null) throw new Exception("Invalid Input");
        return sort(arr, 0, arr.length - 1);
    }

    private int sort(int[] arr, int lo, int hi) {
        if (lo == hi) return 0;

        int mid = (lo + hi) / 2;
        int count = 0;

        count += sort(arr, lo, mid);
        count += sort(arr, mid + 1, hi);

        return count + merge(arr, lo, mid, hi);
    }

    private int merge(int[] arr, int lo, int mid, int hi) {
        int[] copy = new int[hi - lo + 1];
        int index = hi - lo, center = mid + 1;
        int count = 0;
        while (mid >= lo && hi >= center) {
            if (arr[mid] > arr[hi]) {
                count += hi - center + 1;
                copy[index--] = arr[mid--];
            } else {
                copy[index--] = arr[hi--];
            }
        }

        while (mid >= lo) {
            copy[index--] = arr[mid--];
        }

        while (hi >= center) {
            copy[index--] = arr[hi--];
        }

        for (int i = 0; i < copy.length; i++) {
            arr[lo + i] = copy[i];
        }

        return count;
    }
}
