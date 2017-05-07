package com.guopeng.algorithm.real.code.Array;

/**
 * Created by guopeng on 2017/5/7.
 */
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }

        int n = nums1.length, m = nums2.length;
        int low = 0, hi = n;
        int i = 0, j = 0;
        while (low <= hi) {
            i = (low + hi) / 2;
            j = (n + m + 1) / 2 - i;
            if (i > 0 && nums1[i - 1] > nums2[j])
                hi = i - 1;
            else if (i < n && nums2[j - 1] > nums1[i])
                low = i + 1;
            else
                break;
        }

        System.out.println(i);
        System.out.println(j);
        int maxLeft = 0;
        if (i == 0) maxLeft = nums2[j - 1];
        else if (j == 0) maxLeft = nums1[i - 1];
        else maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);

        if ((m + n) % 2 == 1)
            return maxLeft;

        int minRight = 0;

        if (i == n) minRight = nums2[j];
        else if (j == m) minRight = nums1[i];
        else minRight = Math.min(nums1[i], nums2[j]);

        return (maxLeft + minRight) / 2.0;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        System.out.println(findMedianSortedArrays(arr1, arr2));

        arr1 = new int[]{1, 1};
        arr2 = new int[]{1, 2};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
