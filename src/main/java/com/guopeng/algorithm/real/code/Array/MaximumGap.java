package com.guopeng.algorithm.real.code.Array;

import com.guopeng.algorithm.codeinterview.utils.Print;
import com.guopeng.algorithm.util.sort.RadixSort;

/**
 * Created by guopeng on 17-5-2.
 */
public class MaximumGap {
    public static int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        int[] arr = new RadixSort().radixSort(nums, 10);

        int result = 0;
        for (int i = 1; i < arr.length; i++)
            result = Math.max(result, arr[i] - arr[i - 1]);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 3, 0, 4};
        System.out.println(maximumGap(arr));

        arr = new int[]{100, 3, 2, 1};
        System.out.println(maximumGap(arr));
    }
}
