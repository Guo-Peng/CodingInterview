package com.guopeng.algorithm.codeinterview.chapter5;

import com.guopeng.algorithm.codeinterview.chapter2.QuickSort;

/**
 * Created by guopeng on 2017/2/15.
 */
public class MoreThanHalfNumber {
    QuickSort quickSort = new QuickSort();

    /**
     * 找到数组中次数超过一半的数字
     * 时间复杂度o(n)
     * <p>
     * 由于数字大于数组的一半，因此排序之后数组的中位数一定为给数字
     * 使用partiton函数每次返回一个排序过的数字在数组中的索引
     * 如果该数字的索引为length/2则该数字为中位数
     *
     * @param arr
     * @return
     */
    public int moreThanHalfNumberMiddle(int[] arr) throws Exception {
        if (arr == null) throw new Exception("Invalid Input");

        int start = 0, end = arr.length - 1;
        int index = quickSort.partition(arr, start, end);

        while (index != arr.length / 2) {
            if (index > arr.length / 2) end = index - 1;
            else start = index + 1;
            index = quickSort.partition(arr, start, end);
        }
        inputCheck(arr, arr[index]);

        return arr[index];
    }

    /**
     * 时间复杂度o(n)
     * 保留遇到的数字并计数
     * 遇到下一个不同的数字count --
     * 遇到相同的count ++
     * count =0 时记录当前的数字并从1开始计数
     * n设置num的次数大于所有其他数字的总和
     *
     * @param arr
     * @return
     * @throws Exception
     */
    public int moreThanHalfNumber(int[] arr) throws Exception {
        if (arr == null) throw new Exception("Invalid Input");

        int num = arr[0], count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (count == 0)
                num = arr[i];

            if (arr[i] == num) count++;
            else count--;
        }
        inputCheck(arr, num);

        return num;
    }

    private void inputCheck(int[] arr, int num) throws Exception {
        int count = 0;
        for (int n : arr)
            if (n == num) count++;

        if (count <= arr.length / 2) throw new Exception("Invalid Input");
    }


}
