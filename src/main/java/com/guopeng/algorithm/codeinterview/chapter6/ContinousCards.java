package com.guopeng.algorithm.codeinterview.chapter6;

import com.guopeng.algorithm.codeinterview.chapter2.QuickSort;

/**
 * Created by guopeng on 17-2-22.
 */
public class ContinousCards {
    /**
     * 判断抽出的5张牌是否为顺子 大小王可以替代任何牌
     *
     * @param arr
     * @return
     * @throws Exception
     * @comment 不能出现对子，间隔不可超过0的个数
     */
    public boolean isContinue(int[] arr) throws Exception {
        if (arr == null) return false;
        new QuickSort().quickSort(arr, 0, arr.length - 1);

        int count = 0;
        int pre = -1;
        for (int num : arr) {
            if (num == 0) {
                count++;
                continue;
            }

            if (pre == -1) {
                pre = num;
                continue;
            }

            if (num == pre) return false;
            else if (num - pre - 1 > count) return false;
            else count -= (num - pre - 1);

            pre = num;
        }

        return true;
    }
}
