package com.guopeng.algorithm.real.meituan;

/**
 * Created by guopeng on 17-3-28.
 */
public class LocalMax {
    public static int localMax(int[] arr) throws Exception {
        if (arr == null) throw new Exception("Invalid Input");
        int n = arr.length;

        if (n == 1 || arr[0] > arr[1]) return arr[0];
        if (arr[n - 1] > arr[n - 2]) return arr[n - 1];

        return search(arr, 0, n - 1);
    }

    private static int search(int[] arr, int lo, int hi) {
        int mid = (hi - lo) / 2;

        if (arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1]) return arr[mid];
        else if (arr[mid] >= arr[mid - 1]) return search(arr, mid + 1, hi);
        else return search(arr, lo, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 5, 3, 1, 0};
        try {
            System.out.println(localMax(arr));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}