package com.guopeng.algorithm.codeinterview.chapter5;

/**
 * Created by guopeng on 2017/2/16.
 */
public class GreatestSumOfSubArrays {
    /**
     * 数组中一个或多个连续数字形成一个子数组，求子数组的和的最大值
     * 时间复杂度要求o(n)
     *
     * @param arr
     * @return
     * @comment 如果sum小于0则加上下一个数一定小于下一个数，所以将sum置为下一个数
     * max记录sum累加过程中的最大值，有可能最大值之后遇到很多负数导致sum重新计数
     * 将max初始设置为int最小值
     */
    public int greatestSumOfSubArrays(int[] arr) throws Exception {
        if (arr == null) throw new Exception("Invalid Input");

        int sum = 0;
        int max = 0x80000000;
        for (int num : arr) {
            if (sum < 0) sum = num;
            else sum += num;

            if (sum > max) max = sum;
        }

        return max;
    }

    /**
     * f(i)为以下标为i的数字结尾的子数组的最大和
     * f(i) = num if(f(i-1)<-0) else f(i-1)+num
     *
     * @param arr
     * @return
     * @throws Exception
     */
    public int greatestSumOfSubArraysDP(int[] arr) throws Exception {
        if (arr == null) throw new Exception("Invalid Input");
        return f(arr, 0x80000000, 0);
    }

    private int f(int[] arr, int sum, int index) {
        if (index + 1 == arr.length) return sum;

        if (sum < 0) sum = arr[index];
        else sum += arr[index];

        return Math.max(sum, f(arr, sum, index + 1));
    }
}
