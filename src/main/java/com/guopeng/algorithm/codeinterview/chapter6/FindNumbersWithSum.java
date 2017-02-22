package com.guopeng.algorithm.codeinterview.chapter6;

/**
 * Created by guopeng on 2017/2/20.
 */
public class FindNumbersWithSum {
    /**
     * 查找数组中和恰为sum的两个数字
     *
     * @param arr
     * @param sum
     * @comment 和大于sum则将hi前移，和小于sum则将lo后移，汇合则结束
     */
    public void twoNumbersWithSum(int[] arr, int sum) {
        if (arr == null || sum < arr[0] * 2 || sum > arr[arr.length - 1] * 2) return;

        for (int lo = 0, hi = arr.length - 1; lo < hi; ) {
            if (arr[lo] + arr[hi] < sum) lo++;
            else if (arr[lo] + arr[hi] > sum) hi--;
            else {
                System.out.println(String.format("sum %d : %d , %d", sum, arr[lo], arr[hi]));
                return;
            }
        }
    }

    /**
     * 打印所有和为sum的整数序列
     *
     * @param sum
     * @comment curSum大于sum则small后移，小于sum则big后移
     * 由于序列至少二个元素,所以small要小于sum+1/2
     */
    public void continueSequenceWithSum(int sum) {
        for (int small = 1, big = 2, curSum = small + big; small < (sum + 1) / 2; ) {

            if (curSum < sum) curSum += ++big;
            else if (curSum > sum) curSum -= small++;
            else {
                System.out.println(String.format("sum %d : %d ~ %d", sum, small, big));
                curSum += ++big;
                curSum -= small++;
            }
        }
    }


}
