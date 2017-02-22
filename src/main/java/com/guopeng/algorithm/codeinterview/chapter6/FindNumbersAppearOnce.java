package com.guopeng.algorithm.codeinterview.chapter6;

/**
 * Created by guopeng on 2017/2/18.
 */
public class FindNumbersAppearOnce {
    /**
     * 数组中只出现一次的数字
     * 数字异或自己为0，异或0得到自己
     *
     * @param arr
     * @return
     * @comment 遍历异或之后得到两个相异数字的异或
     * 找到结果中的第一个不同的位dif
     * 将每个数字与dif与可将数组分为两个子数组
     * 每个子数组中只有一个只出现一次的数字
     */
    public int[] findNumbersAppearOnce(int[] arr) {
        int norOfTwo = 0;
        for (int num : arr) norOfTwo ^= num;

        int dif = 1;
        while ((dif & norOfTwo) == 0) dif <<= 1;

        int first = 0, second = 0;
        for (int num : arr) {
            if ((num & dif) == 0) first ^= num;
            else second ^= num;
        }
        if (first > second) return new int[]{second, first};
        else return new int[]{first, second};


    }
}
