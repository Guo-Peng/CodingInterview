package com.guopeng.algorithm.real.meituan;

/**
 * Created by guopeng on 17-3-28.
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int value) {
        if (arr == null) return -1;

        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (arr[mid] == value) return mid;
            else if (arr[mid] > value) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }

    public static boolean rotateBinarySearch(int[] arr, int value, int lo, int hi) {
        if (arr == null || lo > hi) return false;

        int mid = (lo + hi) / 2;
        if (arr[mid] == value || arr[lo] == value || arr[hi] == value) return true;
        else if (arr[mid] == arr[lo] && arr[mid] == arr[hi])
            return rotateBinarySearch(arr, value, lo, mid - 1) || rotateBinarySearch(arr, value, mid + 1, hi);
        else if (arr[mid] >= arr[lo]) {  //mid 为左侧区间
            if (value < arr[mid] && value > arr[lo]) hi = mid - 1;
            else lo = mid + 1;
        } else { // mid 为右侧区间
            if (value > arr[mid] && value < arr[hi]) lo = mid + 1;
            else hi = mid - 1;
        }

        return rotateBinarySearch(arr, value, lo, hi);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 5));

        arr = new int[]{3, 4, 5, 1, 2, 3};
        System.out.println(rotateBinarySearch(arr, 6, 0, arr.length - 1));
        System.out.println(rotateBinarySearch(arr, 3, 0, arr.length - 1));
        System.out.println(rotateBinarySearch(arr, 4, 0, arr.length - 1));

        arr = new int[]{3, 3, 3, 1, 2, 3};
        System.out.println(rotateBinarySearch(arr, 2, 0, arr.length - 1));
        arr = new int[]{3, 4, 3, 3, 3, 3};
        System.out.println(rotateBinarySearch(arr, 4, 0, arr.length - 1));
    }
}
