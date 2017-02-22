package com.guopeng.algorithm.codeinterview.chapter5;

import com.guopeng.algorithm.codeinterview.chapter2.QuickSort;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by guopeng on 2017/2/16.
 */
public class GetLeastNumbers {
    QuickSort quickSort = new QuickSort();

    /**
     * 找出数组中的最小的k个数字
     *
     * @param arr
     * @param n
     * @return
     * @throws Exception
     * @comment 通过partition找到下标为k-1的数字即将k个数字的索引找到
     */
    public int[] getLeastNumbers1(int[] arr, int n) throws Exception {
        if (arr == null || n > arr.length) throw new Exception("Invalid Input");

        int start = 0, end = arr.length - 1;
        int index = quickSort.partition(arr, start, end);

        while (index != n - 1) {
            if (index > n - 1) end = index - 1;
            else start = index + 1;
            index = quickSort.partition(arr, start, end);
        }

        int[] result = new int[n];

        System.arraycopy(arr, 0, result, 0, n);
        return result;
    }

    /**
     * treeset 底层使用红黑树实现，任何操作的复杂度均为log k
     * 可使用最大堆或者红黑树
     * 最大堆在o(1)时间找到最大值，log k完成删除及插入
     * 适合海量数据且不能修改数组
     * treeset不能重复
     *
     * @param arr
     * @param n
     * @return
     * @throws Exception
     */
    public int[] getLeastNumbers(int[] arr, int n) throws Exception {
        if (arr == null || n > arr.length) throw new Exception("Invalid Input");

        TreeSet<Integer> leastNumbers = new TreeSet<>();
        for (int num : arr) {
            if (leastNumbers.size() < n) leastNumbers.add(num);
            else {
                int max = leastNumbers.last();
                if (num < max) {
                    leastNumbers.remove(max);
                    leastNumbers.add(num);
                }
            }
        }
        return setToInt(leastNumbers);
    }

    private static int[] setToInt(Set<Integer> set) {
        Integer[] temp = set.toArray(new Integer[]{});

        int[] arr = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }
}
