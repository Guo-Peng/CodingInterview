package com.guopeng.algorithm.real.code.Array;

/**
 * Created by guopeng on 17-4-28.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cur = n + m;
        while (cur > 0 && n > 0) {
            if (m == 0 || nums1[m - 1] <= nums2[n - 1])
                nums1[cur-- - 1] = nums2[n-- - 1];
            else
                nums1[cur-- - 1] = nums1[m-- - 1];
        }
    }
}
