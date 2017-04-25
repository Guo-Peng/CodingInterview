package com.guopeng.algorithm.real.code.Math;

/**
 * Created by guopeng on 17-4-25.
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int value) {
        return binarySearch(arr, arr.length, value);
    }

    public static int binarySearch(int[] arr, int n, int value) {
        if (arr == null || n < 0) return -1;

        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (arr[mid] == value) return mid;
            else if (arr[mid] > value) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }

    public static int binarySearchI(int[] arr, int value) {
        return binarySearchI(arr, arr.length, value);
    }

    public static int binarySearchI(int[] arr, int n, int value) {
        if (arr == null || n < 0) return -1;

        int lo = 0, hi = n;
        while (lo < hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (arr[mid] == value) return mid;
            else if (arr[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return -1;
    }

    public static int binarySearchFirstPos(int[] arr, int value) {
        return binarySearchFirstPos(arr, arr.length, value);
    }

    /**
     * 左闭右开区间
     * 返回大于等于value的第一个元素索引
     * 有重复时返回第一个
     * lo为0 - n ，为n时失败
     * 失败时返回-low -1，-1为了避免low =0时的失败被认为成功
     *
     * @param arr
     * @param n
     * @param value
     * @return
     */
    public static int binarySearchFirstPos(int[] arr, int n, int value) {
        if (arr == null || n < 0) return -1;

        int low = 0, hi = n;
        while (low < hi) {
            int mid = low + ((hi - low) >> 1);

            if (arr[mid] < value) low = mid + 1;
            else hi = mid;
        }

        if (low >= n || arr[low] != value)
            return -low - 1;
        else return low;
    }

    public static int binarySearchLastPos(int[] arr, int value) {
        return binarySearchLastPos(arr, arr.length, value);
    }

    /**
     * 左开右闭区间
     * 返回不大于value的最后一个索引
     * 有重复时返回最后一个
     * hi为 -1 - n-1 为-1时查找失败
     * hi 为 -1时如果仍然返回-hi-1则会返回0
     *
     * @param arr
     * @param n
     * @param value
     * @return
     */
    public static int binarySearchLastPos(int[] arr, int n, int value) {
        if (arr == null || n < 0) return -1;

        int low = -1, hi = n - 1;
        while (low < hi) {
            int mid = hi - ((hi - low) >> 1);
            if (arr[mid] > value) hi = mid - 1;
            else low = mid;
        }

        if (hi < 0 || arr[hi] != value)
            return -hi - 2;
        else return hi;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 9, 9, 9, 15, 18, 23};

        System.out.println(binarySearchFirstPos(arr, 9));
        System.out.println(binarySearchFirstPos(arr, 8));

        System.out.println(binarySearchLastPos(arr, 9));
        System.out.println(binarySearchLastPos(arr, 8));
    }


}
